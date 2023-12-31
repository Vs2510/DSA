public class prime {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else if(n==2){
            return true;
        }
        else if(n%2==0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i=i+2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if (isPrime(7)){
            System.out.println("yes");
        }
    }
    
}
