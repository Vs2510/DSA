import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int r;
    
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number: ");
        int n= sc .nextInt();
        while (n>0){
            r=n%10;
            System.out.print( r  );
            n=n/10;
        }
        
        

    }
    
}
