package Queues;

public class LinkedList_queues {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if (size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
             if(size==0){
                System.out.println("Empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;

        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueLL l1=new queueLL();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.display();
        l1.add(4);
        l1.display();
        System.out.println(l1.remove());
        l1.display();
        
        
    }
    
}
