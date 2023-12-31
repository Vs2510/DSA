import java.util.Scanner;

public class powerno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base:");
        double b=sc.nextDouble();
        System.out.println("Enter exponent:");
        double exp=sc.nextDouble();
        double res=Math.pow(b,exp);
        System.out.println(res);
    }
    
}
