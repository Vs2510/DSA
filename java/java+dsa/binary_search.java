import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        int beg=0,mid;
        int c=0, end;
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=sc.nextInt();
         end=n-1;
        int [] arr;
        arr=new int[n];
        System.out.println("Enter elements to array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the element to search: ");
        int item=sc.nextInt();
        while (beg<=end){
            mid=(beg+end)/2;
            if (arr[mid]==item){
                c++;
                break;
            }
            else if (item>arr[mid]){
                beg=mid+1;
            }
            else if (item<arr[mid]){
                beg=mid-1;
            }
            

        }
        if (c>0){
            System.out.println("Item found " );
        }
        else {
            System.out.println("Not found");
        }
    }
    
}
