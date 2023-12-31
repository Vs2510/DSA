package Stacks;

import linkedlist.new_LinkedList;

public class stacksusing_linkedList {
    public static class Node{
        public Node(int x) {
        }
        int val;
        Node next;
    }
    public static class linked_list{
        Node head=null;
        int size=0;
         void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;

        }
        void display()// rev
        {
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int pop(){
            if(head==null){
                System.out.println("Empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }
        int peek(){
            if (head==null){
                return -1;

            }
            return head.val;
        }
        
 }
    
    public static void main(String[] args) {
        linked_list l=new linked_list();
        l.push(3);
        l.push(2);
        l.push(1);
        l.display();
        
    }
    
}
