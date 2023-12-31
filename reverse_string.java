import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
    }
}
