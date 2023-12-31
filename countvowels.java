import java.util.Scanner;

public class countvowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="vaibhav";
        int v=0;
        char []ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
           if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
                v++; 
        }
        System.out.println(v);

        
    }
    
}
