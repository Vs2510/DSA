import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        System.out.println(sum);
        if (sum==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
    }
    
}
