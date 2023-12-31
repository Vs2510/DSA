import java.util.Scanner;

public class evenoddarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int even=0,odd=0;
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter elements: ");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
    
}
