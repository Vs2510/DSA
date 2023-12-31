import java.util.Scanner;
public class rotateMatrix{
    // for rotate 1st we take transpose then reverse
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
for(int i=0; i<r; i++)  //r is the number of rows  
{  
for(int j=i; j<c/2; j++)   //c is the number of columns  
{  
   if(i!=j)  
{  
//swapping elements of the first column with last column  
    int temp1 = a[i][j];  
       a[i][j]=a[i][c-j-1];  
       a[i][c-j-1]=temp1;  
}  
}  
} 
 for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        } 



    }
}