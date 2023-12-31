public class gcd {
    static int Gcd_num(int a, int b){
        if(b==0)return a;
        return Gcd_num(b,a%b);
    }
    public static void main(String[] args) {
         System.out.println(Gcd_num(75,90));
        
    }

    
}
