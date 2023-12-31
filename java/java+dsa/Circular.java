import java.util.Scanner;
public class Circular {
    static class node{
        int data;
        node next;
        public node (int data){
            this.data=data;
            this.next=null;
        }
    }
    node head=null;
    node tail = null;
    public void creation(){
        int data,n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter data: ");
            data = sc .nextInt();
            node new_node=new node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
            }
            else{
                System.out.println("Enter 1 for begin . 2 for end . 3 for any position:");
                m=sc.nextInt();
                switch (m){
                    case 1:
                    new_node.next=head;
                    head=new_node;
                    break;
                    case 2:
                    tail.next=new_node;
                    tail=new_node;
                    new_node.next=head;
                    break;
                    case 3:
                    System.out.println("Enter the index position to insert:");
                     p = sc.nextInt();
                    node temp1=head;
                    for (int i=0;i<(p-1);i++){
                        temp1=temp1.next;

                    }
                    new_node.next=temp1.next;
                    temp1.next=new_node;
                    break;

                }
                
            }
            System.out.println("Do u wish to proceed? if yes press 1 !");
                n = sc.nextInt();


        } while (n==1);
       
    }
    public void traverse(){
        node temp=head;
        if (head==null){
            System.out.println("Nothing");
        }
        else {
            do{
                System.out.print(temp.data+ " ");
                temp=temp.next;
            } while (temp!=head);
        }
    }
    public static void main(String[] args) {
        Circular c =new Circular();
        c.creation();
        c.traverse();
    }


    
}
