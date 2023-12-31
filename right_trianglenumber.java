public class right_trianglenumber {
    public static void main(String[] args) {
        int n=4;
        int c=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                c++;
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
}
