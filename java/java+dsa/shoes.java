import java.util.Scanner;

public class shoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
       while (t!=0){
        t--;
        int n= sc.nextInt();
      
        int m=sc.nextInt();
        int p=2*(n/2);
        int k=2*(n/2);
        if (n<=m){
            System.out.println(n);
        }
        else{
        int u=p-m;
        int buy=u+k;
        System.out.println(buy);
    }

    
}
}
}
