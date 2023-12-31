import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
System.out.print(n1 + " " +  n2);
        for (int i=2;i<10;i++){
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2; // value of n2 goes to n1//
            n2=n3; // value of n3 goes to n2 //
        }
       /*  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n]; */

    }
    
}
