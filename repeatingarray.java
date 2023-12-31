import java.util.Scanner;

public class repeatingarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the elements:");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("repeated");
    for (int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                
                System.out.println(arr[j]);
            }
        }
    }
        

}
}
