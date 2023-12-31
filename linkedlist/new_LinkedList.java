package linkedlist;

public  class new_LinkedList {
 public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;

    }
}

    public  static class Linked_List{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            Node temp=head;
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
        }
        int size(){
            Node temp=head;
            int c=0;
            while(temp!=null){
                c++;
                temp=temp.next;
            }
            return c;
        }
        void insertAtbegin(int data){
            Node temp=new Node(data);
            if(head==null){//empty list
               // head=temp;
                //tail=temp;
                head=tail=temp;
                insertAtEnd(data);

            }
            else{
                //non empty list
                temp.next=head;
                head=temp;
            }
        }
        void insertAt(int idx,int data){
            Node t=new Node(data);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(data);
                return ;
            }
            else if(idx==0){
                insertAtbegin(data);
                return;

            }
            else if(idx<0 || idx>size()){
                System.out.println("Error");
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        // return the element at any given index
        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

}
    public static void main(String[] args) {
        Linked_List ll=new Linked_List();
        ll.insertAtEnd(3);
        ll.insertAtEnd(7);
        ll.insertAtEnd(34);
        ll.insertAtEnd(2);
        ll.insertAtEnd(10);
        ll.insertAtbegin(1);
        ll.insertAt(2,45 );
       // System.out.println(ll.size());
        ll.display();
       // System.out.println(ll.getAt(1));

        
    }
    
}
