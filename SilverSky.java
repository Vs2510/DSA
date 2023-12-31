import java.util.Scanner;

public class SilverSky {
    public static long calculatePower(int base, int exponent) {
        long result = 1;
        long sum=0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
      
      
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long sum=0;
        System.out.println("Enter lower limit: ");
        int l=sc.nextInt();
        System.out.println("Enter upper limit: ");
        int u =sc.nextInt();
        for (int base=l;base<=u-1;base++){
            int exponent=base+1;
            long result=calculatePower(base, exponent);
            System.out.println(base + "^" + exponent + " = " +result);
              sum=sum+result;
        }
        System.out.println("The sum of all these is:- "+sum);
        
    }
    
}
