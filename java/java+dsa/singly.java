import java.util.Scanner;

public class singly {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;

        }

    }
    Node head = null;
    public void creation(){
        int data,n;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node=new Node (data);
            if (head==null){
                head = new_node;
            }

            else{
                System.out.println("Enter 1 to insert at start , 2 for end and 3 for specific position");
                int m =sc.nextInt();
                switch (m){
                    case 1:
                    new_node.next=head;
                    head = new_node;
                    break;
                    case 2:
                    Node temp=head;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next=new_node;
                    break;
                    case 3:
                    System.out.println("Enter the index position to insert:");
                    int p = sc.nextInt();
                    Node temp1=head;
                    for (int i=0;i<(p-1);i++){
                        temp1=temp1.next;

                    }
                    new_node.next=temp1.next;
                    temp1.next=new_node;
                    break;
                }
            }
            System.out.println("Do you wish to continue? if yes press 1!");
            n=sc.nextInt();
        }
        while (n==1);
    
    }

    public void traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty list");
        }
        else {
            while(temp!=null){
                
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
    }
    public void delete(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do{
            if (head==null){
                System.out.println("Empty list");
            }
            else{
                System.out.println("Enter 1 to delete from beginning, 2 to delete from end and 3 to delete from a specific position");
                int m = sc.nextInt();
                switch(m){
                    case 1:
                    Node temp = head;
                    temp=temp.next;
                    head = temp;
                    break;
                    case 2:
                    Node temp1=head;
                    Node ptr = temp1.next;
                    while (ptr.next!=null){
                        temp1=ptr;
                        ptr=ptr.next;
                    }
                    temp1.next=null;
                    break;
                    case 3:
                    System.out.println("Enter the index position to delete: ");
                    int p = sc.nextInt();
                    Node temp2 =head;
                    Node ptr1=temp2.next;
                    for (int i=0;i<p-2;i++){
                        temp2=ptr1;
                        ptr1=ptr1.next;
                        
                    }
                    temp2.next=ptr1.next;
                    break;

                }
                
            }
            System.out.println("Do you wish to delete more ? if yess press 1");
            n= sc.nextInt();

        }  while (n==1);
    }
    public static void main(String[] args) {
        singly ll=new singly();
        ll.creation();
        ll.delete();
        ll.traverse();
        
    }
    
}
