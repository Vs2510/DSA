import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int[]arr={2,1,5,7,9};
        int n=arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to find:");
        int search=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==search){
                System.out.println("Element found at: " +i);
            }
        }
    }
    
}
