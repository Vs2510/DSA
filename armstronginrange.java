import java.util.Scanner;
public class armstronginrange{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int a=sc.nextInt();
        System.out.println("Enter upper limit: ");
        int b=sc.nextInt();
        //int temp=i;

        int sum=0;
        int f=0;
        for (int i=a;i<=b;i++){
            int temp=i;
            while (i>0){
                int rem=temp%10;
                sum+=(rem*rem*rem);
                temp=temp/10;
            }
            if (sum==i){
                System.out.println(i + " ");
            }
        }
        System.out.println("Hello");

    }

}