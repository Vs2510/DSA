import java.util.Scanner;

public class quadrant_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n=5;
        while (n>0){
            n--;
        System.out.println("Enter x and y: ");
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        
        
        if (x==0 && y==0){
            System.out.println("origin");
        }
        else if (x>0 && y>0){
            System.out.println("First");

        }
        else if (x<0 && y>0){
            System.out.println("Second");
        }
        else if (x>0 && y<0){
            System.out.println("Fourth");
        }
        else{
            System.out.println("Third");
        }
    
    }
}
    
}
