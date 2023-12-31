import java.util.Scanner;

public class bistoconvert {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a: ");
        int a= sc.nextInt();
        System.out.println("Enter b: ");
        int b= sc.nextInt();
        int n;
        n=a^b;
        int c=0;
       
        while (n>0){
            c++;
            n&=(n-1);
           // System.out.println(c);
        }
        
        System.out.println("The total number of bits required to convert is =  " + c);
    }
    
}
