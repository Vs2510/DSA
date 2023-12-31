public class butterfly {
    public static void main(String[] args) {
        int n=4;
        // upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            int spaces =2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");

            }
            //2ndpart for upper
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println(" ");
        }
        // lower half

        for(int i=n;i!=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            int spaces =2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");

            }
            //2ndpart for upper
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }
}
