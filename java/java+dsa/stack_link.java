import java.util.Scanner;

class stack_linked{
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top =null;
    void push(Scanner sc){
        System.out.println("Enter data: ");
         int data = sc.nextInt();
        Node new_node=new Node (data);
        if (top==null){
            top = new_node;
        }
        else{
            new_node.next=top;
            top = new_node;
            System.out.println("Successfully inserted");

        }
    

    }
    void pop(){
        if (top==null){
            System.out.println("Empty");
        }
        else{
            top = top.next;
            System.out.println("Successfully deleted");
        }
    }
    void display(){
        Node temp=top;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }



    }

public class stack_link {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack_linked s = new stack_linked();
        int d,w;
        do{
            System.out.println("Enter 1 for push 2 for pop 3 for display:");
            d=sc.nextInt();
            switch(d){
                case 1:{

                s.push(sc);
                 break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:{
                    s.display();
                    break;
                }


            }
            System.out.println("Do u wish to continue? If yes press 1");
            w=sc.nextInt();

        }while(w==1);
        System.out.println("Successfully exited !!");
       
    }
    
}
