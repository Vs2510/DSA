import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[]=new int[5];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter");
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted");
         for (int i=0;i<arr.length;i++){
            for ( int j=i+1;j<arr.length;j++){
                    if (arr[i]>arr[j])//  ascending
                    // for descending arr[i]<arr[j]
                    {
                        int t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                    }
                   
            }

        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        
    }
}
