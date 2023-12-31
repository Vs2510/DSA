import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int r = sc .nextInt();
        int [] a= new int [r];
        System.out.println("Enter the elements to array: ");
        for ( i=0;i<r;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search: ");
        int x = sc.nextInt();
        for ( i=0;i<r;i++){
            if (a[i]== x){
                System.out.println("Element found at index = " + i);
                break;
            }
            
        }
        if (i==r){
            System.out.println("Not found");
        }
    }
    
}
