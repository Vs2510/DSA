import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;

public class array_insert {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[]a =new int [size];
        System.out.println("Enter the values: ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
            // inserting
            int []b=new int[size+1];
            System.out.println("Enter a number to insert: ");
            int r=sc.nextInt();
            System.out.println("Enter index : ");
            int index=sc.nextInt();
            for(int i  =0;i<size+1;i++){
                if(i<index){
                    b[i]=a[i];
                }
                else if(i==index){
                    b[i]=r;

                }
                else{
                    b[i]=a[i-1];
                }
            }
System.out.println("elements are :");
for(int  i=0;i<size;i++){
    System.out.println(b[i]);
}

        }
    }
    

