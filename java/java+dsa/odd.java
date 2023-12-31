public class odd {
    public static void main(String[] args) {
        int n=100;
        int sum=0;
        for(int i=1;i<=n;i=i+2)
        {
             System.out.println(i);
             sum=sum+i;
        }
        System.out.println("The sum is : " + sum );
    }
    
}
