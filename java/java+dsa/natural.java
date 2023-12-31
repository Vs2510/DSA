import java.util.Scanner;

public class natural {
    public static void main( String args[]){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        for (int i=0;i<=n;i++){
            if (i%2==0){
                sum=sum+i;
                System.out.println(i);
            }
           
        }
        System.out.println(sum);
    }
    
}
