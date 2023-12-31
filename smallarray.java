import java.util.Scanner;

public class smallarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
       for (int i=0;i<arr.length;i++){
        System.out.println("Enter elements: ");
        arr[i]=sc.nextInt();
       }
       int min=arr[0];
       int min2=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
        if (min>arr[i]){
            min=arr[i];
        }
       }
       System.out.println(min);
       for (int i=0;i<arr.length;i++){
        if(arr[i]!=min && min2>arr[i]){
            min2=arr[i];
        }
       }
       System.out.println(min2);
        
    }
    
}
