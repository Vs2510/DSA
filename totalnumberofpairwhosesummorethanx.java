import java.util.Scanner;

public class totalnumberofpairwhosesummorethanx {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter array size:");
         int n=sc.nextInt();
         int []arr=new int[n];
         System.out.println("Enter:");
         for (int i=0;i<n;i++){
            System.out.println("enter Now:");
            arr[i]=sc.nextInt();
         }
         int ans=0;
         int x=7;
         for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==x){
                    ans++;
                }
            }

         } 
         System.out.println(ans);
        
        }
    
}
