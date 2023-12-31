public class swap_sum_diff {
    public static void main(String[] args) {
        int a=9;
        int b=3;
        System.out.println("Original");
        System.out.println(a);
        System.out.println(b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped");
        System.out.println(a);
        System.out.println(b);
    }
}
