public class modulo_arith {
    static int fastPower(int a,int b,int n){
        int res=1;
        while(b>0){
            if((b&1)!=0){
                res=(res*a%n)%n;
            }
            a=(a%n*a%n)%n;
            b=b>>1;
        }
        return res;
    }
    public static void main(String[] args) {
    System.out.println(fastPower(3457, 895, 311));
}
    
}
