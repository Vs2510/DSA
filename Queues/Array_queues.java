package Queues;
import java.util.*;
public class Array_queues {
    public static class queueA{
        int f=-1;
        int r=-1;
        int size=0;
        int []arr= new int[100];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("full");
                return;
            }
            if (f==-1){
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[r+1]=val;
                r++;
            }
            size++;

        }
        public int remove(){
            if (size==0){
                System.out.println("Empty");
                return -1;
            }
            int x=arr[f];
            f++;
            size--;
            return x;
        }
        public int peek(){
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Empty");
            }
            else{
                for(int i=f;i<=r;i++){
                  
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        queueA q1=new queueA();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
      System.out.println(q1.peek());
        q1.display();
        
    }
}
