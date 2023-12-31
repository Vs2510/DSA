import java.util.Scanner;

public class bintodeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary digit:");
        int bin=sc.nextInt();
        int dec=0;
        int n=0;
        while(bin>0){
            int rem=bin%10;
            dec+= rem*Math.pow(2,n);
            bin=bin/10;
            n++;
        }
        System.out.println("The decimal number is: "+dec);
                
        }

    
}
