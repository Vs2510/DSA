package Stacks;

public class stacks_usingArrays {
    public static class stack{
        int [] arr=new int[5];
        int idx=0;
        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0) return -1;
            return arr[idx-1];
        }
        int pop(){
            if(idx==0) return -1;
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for (int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;

        }

    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
       // System.out.println(s.size());
        System.out.println(s.peek());

        
    }
    
}
