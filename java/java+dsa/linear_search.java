import java.util.Scanner;;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=sc.nextInt();
        int [] arr;
        arr=new int[n];
        System.out.println("Enter elements to array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        System.out.println("Enter the element to search: ");
        int item=sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if(arr[i]==item){
                c++;
            }
        }
        if (c>0){
            System.out.println("Item exists");
        }
        else{
            System.out.println("Not found!");
        }

        
    }
    
}
