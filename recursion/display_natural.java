public class display_natural {
    public static void natural (int n){
        if (n<0){
            return;
        }
        System.out.println(n);
        natural(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        natural(10);
        
    }
    
}
