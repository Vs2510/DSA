import java.util.Scanner;

public class primeinrange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter lower limit:");
        int lower=sc.nextInt();
        System.out.println("Enter upper limit:");
        int upper=sc.nextInt();
        int flag=0;
        for (int i=lower;i<=upper;i++){
            flag=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    flag++;
                }
            }
                if (flag==2){
                    System.out.print(i + " ");
                }
            

        }
    }
    
}
