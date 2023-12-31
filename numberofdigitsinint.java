import java.util.Scanner;

public class numberofdigitsinint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int n=sc.nextInt();
        int temp=n;
        int c=0;
        while (n>0){
            int rem=n%10;
            c++;
            n=n/10;
        }
        System.out.println(c);
        
    }
    
}
