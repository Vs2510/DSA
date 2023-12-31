import java.util.Scanner;
class multi{

    public static void main( String args [])
    {
        int sum=0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int n= sc.nextInt();
         System.out.println("The multiplication table is:");
         for(int i=10; i!=0;i--)
{
  
    int multiply=n*i;
    System.out.println(multiply);
   // sum = sum+multiply;

}    
System.out.println(sum);     

    }
}