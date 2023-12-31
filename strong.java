import java.util.Scanner;

public class strong {
     public static int fact(int n){
        int f=1;
          for (int i=1;i<=n;i++)
          {
            f=f*i;
          }
         // System.out.println(f);
          return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int rem;
        while (num>0){
            rem=num%10;
            sum=sum + fact(rem);
            num=num/10;
        }
        System.out.println(sum);
        if (sum==temp){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not strong");
        }
    }
    
}
