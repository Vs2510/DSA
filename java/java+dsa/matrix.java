import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the rows: ");
        int r = sc .nextInt();
    System.out.println("Enter the columns: ");
    int c = sc.nextInt();
    int [][] a = new int [r][c];
    System.out.println("Enter the elements for matrix a:");
    for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("The elements are: ");
    for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
            System.out.print(a[i][j]+ " ");
        }
        System.out.println(" ");
    }
    int [][] b = new int [r][c];
    System.out.println("Enter the elements for matrix b:");
    for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
            b[i][j]=sc.nextInt();
        }
    }
    System.out.println("The elements are: ");
    for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
            System.out.print(a[i][j]+ " ");
        }
        System.out.println(" ");
    }
    int [][] sum = new int [r][c];
    System.out.println("The result is : ");
    for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
            sum[i][j] = a[i][j]+b[i][j];
            System.out.print(sum[i][j] + " ");
        }
        System.out.println(" ");
    }
    }
    
}
