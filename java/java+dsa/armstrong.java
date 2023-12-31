import java.util.*;
public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Armstrong number: ");
        int n= sc.nextInt();
        int r;
        int s=0;
        int c=n;
        while (n>0){
            r=n%10;
            s=s+(r*r*r);
            n=n/10;

        }
        if (c==s){
            System.out.println("Armstrong number");
        }
        else
            System.out.println("Not an armstrong number ");
    }
    
}
