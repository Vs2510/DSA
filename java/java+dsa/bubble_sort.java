import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args) {
        
    int temp;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements:");
    int n=sc.nextInt();
    
    int [] arr;
    arr=new int[n];
    System.out.println("Enter elements to array: ");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for (int i=0;i<n-1;i++){
        for (int k=0;k<n-1;k++){
            if (arr[k]>arr[k+1]){
                temp=arr[k];
                arr[k]=arr[k+1];
                arr[k+1]=temp;
            }
        }
    }
    for (int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
    
} 
}
