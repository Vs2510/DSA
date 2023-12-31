public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd1(24, 60));
        
    }   
public static int gcd1 (int a, int b){
    if (b==0) return a;
    return gcd1(b,a%b);

}
}
