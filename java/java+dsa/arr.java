import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int r = sc .nextInt();
        int [] a= new int [r];
        System.out.println("Enter the elements to array: ");
        for (int i=0;i<r;i++){
            a[i]=sc.nextInt();
        }
        /*  System.out.println("The elements are : ");
        for (int i=0;i<r;i++){
            System.out.print(a[i] + " ");
        } */
        int [] b = new int [r-1];
      /* 
        System.out.println("Enter the index where u want to make change: ");
        int m = sc.nextInt();
        System.out.println("Enter the number to insert:");
        int p =sc.nextInt();
        for (int i=0;i<r+1;i++){
            if (i<m){
                b[i]=a[i];
            }
            else  if(i==m) { 
                  b[i]=p;
            }
            else {
                b[i]=a[i-1];
            }
        }
        System.out.println("The new array is: ");
        for (int i=0;i<r+1;i++){
            System.out.print(b[i]+ " ");
        }
*/
System.out.println("Enter the index which you wnat to delete: ");
int m = sc.nextInt();

for (int i=0;i<a.length;i++){
    if (i<m){
        b[i]=a[i];
    }
    else  if(i==m) { 
          continue;
    }
    else {
        b[i-1]=a[i];
    }
}
System.out.println("The new array is: ");
for (int i=0;i<r-1;i++){
    System.out.print(b[i]+ " ");
}




    }      
}
