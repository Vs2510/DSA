import java.util.Scanner;

public class spiral {
    static void displayMatrix(int[][]a){
                 System.out.println("The Matrix is :-");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }
    static void printSpiral(int[][]m,int r,int c)
{
  

}

    public static void main(String[] args) {
        /* 
        1 2 3
        4 5 6
        7 8 9 then the spiral is 1 2 3 6 9 8 7 4 5 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("Enter the elements:- ");
                a[i][j]=sc.nextInt();
            }
        }
        displayMatrix(a);
    }
    
}
