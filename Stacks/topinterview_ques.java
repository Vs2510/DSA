package Stacks;
import java.util.*;
public class topinterview_ques {
    public static boolean isBalanced(String str){
        Stack<Character>st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{ 
                // ch==')'
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if (st.size()>0) return false;
        return true;
    }
public static int []remove(int []arr){
    int n=arr.length;
    Stack<Integer> st=new Stack<>();
    for (int i=0;i<n;i++){
        if(st.size()==0|| st.peek()!=arr[i]) st.push(arr[i]);
        else if(arr[i]==st.peek()){
            if(i==n-1 || arr[i]!=arr[i+1]) {st.pop();}
        }

    }
    int []res=new int[st.size()];
    int m=res.length;
    for(int i=m-1;i>=0;i--){
        res[i]=st.pop();

    }
    
    return res;


}
    public static void main(String[] args) {
     /*    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str=sc.nextLine();
       System.out.println(isBalanced(str));
    
    */
    // remove consecutive subsequences
    // 1 22 3 101010 444 5 77 2
    // ans = 1 3 5 2
    int []arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
    int []res=remove(arr);
    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
    }

}
}
