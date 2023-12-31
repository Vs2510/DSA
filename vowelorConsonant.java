import java.util.Scanner;

public class vowelorConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c=sc.next().charAt(0);
        if (c=='A'||c=='E'||c=='I'|| c=='O' || c=='U' ||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("We have a vowel.");
        }
        else{
            System.out.println("We have a consonant.");
        }
    }
    
}
