import java.util.Scanner;

public class transposeMatrix {

    public static void main(String[] args) {
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
         System.out.println("The Matrix is :-");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
      /*   int ans[][]=new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                ans[i][j]=a[j][i];
            }
        }
         System.out.println("The Transpose  Matrix is :-");
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }*/
        
        for (int i=0;i<r;i++){
            for (int j=i;j<c;j++){
               int temp=a[i][j];
               a[i][j]=a[j][i];
               a[j][i]=temp;
            }
          
        }
        System.out.println("The transpose is: ");
         for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }




}
    
}
