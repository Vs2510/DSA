import java.util.Scanner;

public class replacezeros_ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        String str=Integer.toString(n);
        System.out.println(str);
        int len=str.length();
        String s="";
        for (int i=0;i<len;i++){
            if(str.charAt(i)=='0'){
                s=s+'1';
            }
            else{
                s=s+str.charAt(i);
            }
        }
        System.out.println("New:");
        System.out.print(s);

    }
    
}
