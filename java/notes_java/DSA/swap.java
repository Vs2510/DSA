public class swap {
    public static void main(String[] args) {
        int a=7;
        int b=13;
        System.out.println("The numbers are:" +a + +  + b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
    
}
