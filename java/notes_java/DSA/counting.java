import java.util.Scanner;

public class counting {
    public static int countWords(String s){
        if(s==null ||s.isEmpty()){
            return 0;
        }
        String[]words=s.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String s =sc.nextLine();

        //String s="Hello have a nice day";
        System.out.println(countWords(s));
    }
    
}
