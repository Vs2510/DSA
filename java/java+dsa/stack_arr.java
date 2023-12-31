import java.util.Scanner;
class stack{
    Scanner sc = new Scanner(System.in);
    int top;
    int n=10;
    int [ ] a= new int [n];
    void push(){
        if (top==(n-1)){
            System.out.println("overflow");
        }
        else {
            System.out.println("Enter data: ");
            int i =sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("inserted");

        }
    }
    void pop(){
        if (top==-1){
            System.out.println("Underflow");
        }
        else {
            top=top-1;
            System.out.println("Items deleted");
        }
    }
    /*storing in reverse order     void display(){
        System.out.print("Items in stack are: ");
        for (int j=0;j<=top;j++) {
            System.out.println(a[j] + " ");
        }
    } */

    // storing in normal order // 
    void display(){
        System.out.print("Items in stack are: ");
        for (int j=top;j!=0;j--) {
            System.out.print(a[j] + " ");
        }
    }

}


public class stack_arr {
    public static void main(String[] args) {
        stack s=new stack();
        Scanner sc = new Scanner(System.in);
        int d,w;
        do{
            System.out.println("Enter 1 for push 2 for pop 3 for display:");
            d=sc.nextInt();
            switch(d){
                case 1:{

                s.push();
                 break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:{
                    s.display();
                    break;
                }


            }
            System.out.println("Do u wish to continue? If yes press 1");
            w=sc.nextInt();

        }while(w==1);
        System.out.println("Successfully exited !!");
       
       // s.push();
        //s.pop();
        // s.display();
        
    }
    
}
