import java.util.*;
 import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class fileHandling {
    /**
     * @param args
     */
    public static void main(String[] args) {
      /*  File myfile=new File("john.txt");

        try {
            myfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileWriter myfiles=new FileWriter("john.txt");
            myfiles.write("hi \n How are you?");
            myfiles.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        */
       /*  File Myflie=new File("john.txt");
        try{
            Scanner sc=new Scanner(Myflie);
            while(sc.hasNextLine()){
                String Line=sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }

*/
File myfile=new File("john.txt");
if(myfile.delete()){
    System.out.println("Deleted" + myfile.getName());
}

    }
}

