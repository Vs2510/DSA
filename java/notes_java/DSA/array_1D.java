import java.util.Scanner;

public class array_1D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int []a=new int[size];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The elements are :");
        for(int i=0;i<size;i++){
            System.out.println(a[i]);
        }


    }
}