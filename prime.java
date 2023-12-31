import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int temp=n;
        int prime;
        if (n==0 || n==1){
            System.out.println("Not prime");
        }
        int flag=0;
        for (int i=1;i<=n;i++){
            
            if (n%i==0){
                flag++;
            }
        }
        if (flag==2){
            System.out.println(" prime");
        }
        else{
            System.out.println(" Not Prime");
        }
    }
    
}
