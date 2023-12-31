public class euc {
    public  static int gcd(int a,int b){
        if (a==0){
            return b;
        }
    return gcd(b%a,a);
    }
    public static void main(String[] args) {
        int a=10,b=15;
        int x=gcd(a, b);
        System.out.println(x);
        
    }
    
}
