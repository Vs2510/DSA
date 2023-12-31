package Stacks;

import java.util.*;

public class basicStack {
    public static void display(Stack <Integer> s){
        // reverse
        if(s.size()==0){
            return;
        }
        int top=s.pop();
        System.out.println(top+" ");
        display(s);
        s.push(top );

    }
    public static void main(String[] args) {
        Stack <Integer>st=new Stack<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size: ");
       int n=sc.nextInt();
       for (int i=1;i<=n;i++){
        int x=sc.nextInt();
        st.push(x);
       }
       //System.out.println(st);
       display(st);

       // System.out.println(st.peek());
        
         // copy one stack to other
       /*   Stack <Integer>rt=new Stack<>();
         while(st.size()>0){
            
            rt.push(st.pop());
         }
         System.out.println(rt);

         Stack <Integer>gt=new Stack<>();
         while(rt.size()>0){
            
            gt.push(rt.pop());
         }
         System.out.println(gt);  */
         

    }
    
}
