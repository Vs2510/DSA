/*Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.
 */
import java.util.Scanner;
public class ascending_or_descending{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int size=sc.nextInt();
        int []a=new int[size];
        boolean isasc=false;

    for (int i=0;i<a.length;i++){
        System.out.println("Enter elements of array: ");
        a[i]=sc.nextInt();
    }
// display the array
for (int e:a){
    System.out.print(e+" ");
    System.out.println(" ");
}
    //checking that it is ascending or not
     for (int i=0;i<a.length-1;i++){// as one number will itself get it's position.
        if (a[i]<a[i+1]){ // condition for ascending
            isasc=true;
        }
        else{
            isasc=false;
        }
        
     }
    if (isasc==true){
        System.out.println("In ascending");

    }

    else{
        System.out.println("Not in ascending");
    }

    }

}