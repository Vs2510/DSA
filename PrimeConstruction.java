import java.util.*;

public class PrimeConstruction {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int q = Integer.MAX_VALUE;
        for (String s : input) {
            int num = Integer.parseInt(s);
            if (num < q) {
                q = num;
            }
        }

        int p = q + 1;
        while (true) {
            boolean flag = true;
            if (isPrime(p)) {
                for (String s : input) {
                    int num = Integer.parseInt(s);
                    if (num != q && p % num != 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(p);
                    return;
                }
            }
            p++;
        }
    }
}
