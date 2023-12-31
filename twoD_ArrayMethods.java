import java.util.Scanner;

public class twoD_ArrayMethods {
    static void printMatrix (int[][]m){
    for (int i=0;i<m.length;i++){
          for (int j=0;j<m[i].length;j++){
            System.out.print(m[i][j]+" ");
          }
       System.out.println();  

    }
}
static int [][]findTranspose(int[][]m,int r,int c){//in this method we use a different matrix to find transpose of a particular matrix
    int t[][]=new int[c][r];
    System.out.println("The transpose matrix is as follows: ");
    for (int i=0;i<c;i++){
        for (int j=0;j<r;j++){
            t[i][j]=m[j][i];
        }
      
    }
    return t;
}
static void transposeInPlace(int[][]m,int r,int c){
    //In this method we do not use a different matrix to find transpose rather than we use temporary variable temp and swap values in same matrix itself to get the desired transpose matrix.
   // System.out.println("The inplace transpose is:");
    for (int i=0;i<c;i++){
        for(int j=i;j<r;j++){
            int temp=m[i][j];
            m[i][j]=m[j][i];
            m[j][i]=temp;

        }
    }
}
static void reverseArray(int[]arr){
    int i=0,j=arr.length-1;
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }

}
static void rotate(int [][]m,int n){
    System.out.println("The rotated matrix is:");
    // transpose
    transposeInPlace(m, n, n);
    // reverse each row of transpose matrix
    for(int i=0;i<n;i++){
        reverseArray(m[i]);
    }


}
static int [][]pascal(int n){
    int [][]ans=new int[n][];
    for (int i=0;i<n;i++){
        // ith row has i+1 columns
        ans[i]=new int[i+1]; // ans[0]=new int[0+1],ans[1]=new int[1 +1];
        // 1st and last last element of every row is 1
        ans[i][0]=ans[i][i]=1;
        for (int j=1;j<i;j++){
            ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
        }
    }
    return ans;
}
static void printSpiral(int[][]m,int r,int c){
     int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
     int totalelements=0;
   while(totalelements<r*c){
    // toprow=== left col to right col
    for (int j=leftCol;j<=rightCol && totalelements<r*c;j++){
        System.out.print(m[topRow][j]+" ");
        totalelements++;
        
    }
    topRow++;
    // right col ---- top row to bottom row
    for (int i=topRow;i<=bottomRow && totalelements<r*c;i++){
        System.out.print(m[i][rightCol]+" ");
        totalelements++;
        
    }
    rightCol--;
    // bottom row --- right col to left col
    for (int j=rightCol;j>=leftCol && totalelements<r*c;j--){
            System.out.print(m[bottomRow][j]+" ");
            totalelements++;
            
    }
    bottomRow--;
    // left col ---- bottom row to top row
    for (int i=bottomRow;i>=topRow && totalelements<r*c;i--){
        System.out.print(m[i][leftCol]+" ");
        totalelements++;
    }
    leftCol++;
    
   }
}
static int [][] printnSpiral(int n){
    int [][]m=new int [n][n];
     int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
     int totalelements=1;
   while(totalelements<n*n){
    // toprow=== left col to right col
    for (int j=leftCol;j<=rightCol&& totalelements<n*n;j++){
        m[topRow][j]=totalelements;
        totalelements++;
        
    }
    topRow++;
    // right col ---- top row to bottom row
    for (int i=topRow;i<=bottomRow&& totalelements<n*n;i++){
       m[i][rightCol]=totalelements;
        totalelements++;
        
    }
    rightCol--;
    // bottom row --- right col to left col
    for (int j=rightCol;j>=leftCol && totalelements<n*n;j--){
            m[bottomRow][j]=totalelements;
            totalelements++;
            
    }
    bottomRow--;
    // left col ---- bottom row to top row
    for (int i=bottomRow;i>=topRow&& totalelements<n*n;i--){
        m[i][leftCol]=totalelements;
        totalelements++;
    }
    leftCol++;
    
   }
   return m;

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      /*    System.out.println("Enter rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("Enter the elements:- ");
                a[i][j]=sc.nextInt();
            }
        }
     /*     System.out.println("The Matrix is :-");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
*/
//printMatrix(a);

/*int [][]a2=findTranspose(a, r, c);
printMatrix(a2);
transposeInPlace(a, r, c);
printMatrix(a); 
rotate(a, r);
printMatrix(a);   
System.out.println("Enter n:");
int n=sc.nextInt();
int [][]a3=pascal(n);
printMatrix(a3);*/
/*int [][]m= new int [r][c];
printSpiral(m, r, c);
 

System.out.println("Spiral: ");
printSpiral(a, r, c);  */
System.out.println("Enter n");
int n=sc.nextInt();
int [][]ans=printnSpiral(n);
printMatrix(ans);



    
        

    }
    private static void extracted(int r, int c, int[][] a) {
        printSpiral(a, r, c);
    }
    
}
