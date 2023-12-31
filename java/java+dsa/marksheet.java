import java.util.Scanner;

public class marksheet {

    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Start to enter marks: ");
        do{
            int marks = sc.nextInt();
           if(marks >= 90 && marks <= 100) {
               System.out.println("This is very nice");
           } else if(marks >= 60 && marks <= 89) {
               System.out.println("This is also Good");
           } else if(marks >= 0 && marks <= 59) {
               System.out.println("Good try!! keep it up");
           } else {
               System.out.println("Invalid");
           }
           System.out.println("Do u wish to continue / yes(1) or No (0)");
            input= sc.nextInt();
            if(input ==1){
                System.out.println("Continue entering : ");
            }
            else {
                System.out.println("Marks entering stopped!!!!");
            }

        }while(input==1);
    }
    
}
