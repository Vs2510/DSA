import java.util.Scanner;

public class largestinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int max=arr[0];
        for (int i=0;i<n;i++){
            System.out.println("Enter elements : ");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The largest element is: " + max);
    }
}
