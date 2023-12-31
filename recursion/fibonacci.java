public class fibonacci {
    public static void fibo (int a,int b,int n){
        if (n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);
    }
    public static void main(String[] args) {
        int n=7;
        int a=0;
        int b=1;
        System.out.println(0);
        System.out.println(1);
        fibo(a,b,n-2);
        
    }
    
}
