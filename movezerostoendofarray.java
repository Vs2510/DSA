import java.util.Scanner;

public class movezerostoendofarray {
    public static void main(String[] args) {
        // here we use bubble sort method 
        // 050342 --> 534200
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int []a=new int [n];
        for (int i=0;i<n;i++){
            System.out.print("Enter the elements: ");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(a[j]==0&&a[j+1]!=0){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println();
        for (int e:a){
            System.out.print(e);
        }
    }
    
}
