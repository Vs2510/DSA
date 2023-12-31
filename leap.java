import java.util.Scanner;

public class leap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year you want to check :");
        int n = sc.nextInt();
        if (n%4==0  ||( n%400==0 && n%100!=0)){
            System.out.println("leap");
        }
        else{
            System.out.println("Not leap");
        }

    }
    
}
