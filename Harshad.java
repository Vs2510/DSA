import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
       while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
        if (n%sum==0){
            System.out.println("harshad");
        }
        else{
            System.out.println("Not");
        }
    }
    
}
