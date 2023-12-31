import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rem,sum=0;
        int temp=n;
        int i;
        for (i=1;i<=n/2;i++){
            if (n%i==0){
                sum+=i;

            }
        }
        System.out.println(sum);
        if (sum==temp){
            System.out.println("Perfect");
        }
        else{
            System.out.println("Not");
        }
    }

    
}
