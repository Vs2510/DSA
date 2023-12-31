
import java.util.*;
public class factorial_method {
    int fact=1;
    public static int factorial (int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            
            fact=fact*i;
           

        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int res = factorial(n);
        System.out.println("The factorial of the number is : " + res);

        
    }
}
