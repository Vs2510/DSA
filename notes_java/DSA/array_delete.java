import java.util.*;
public class array_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int []a=new int[size];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number to delete");
        int d=sc.nextInt();
        int []b=new int[size-1];
        for(int i=0;i<size-1;i++){
            System.out.println(b[i]);
        }
    }
    
}
