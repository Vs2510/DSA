public class fact{
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
  
    public static void main(String[] args) {
        int n=7;
    int f1=factorial(n);
      int r=4;
      int num=n-r;
     int f2=factorial(num);
     int p=f1/f2;
     System.out.println(p);
    }
}