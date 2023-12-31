import java.io.*;
public class file {
    public static void main(String[] args) {
        try{
            File obj=new File("file.txt");
            if (obj.createNewFile()){
                System.out.println("File created"+ obj.getName());
            }
            else{
                System.out.println("File already exists!");
            }
            FileWriter writer=new FileWriter("file.txt");
            writer.write("Hello");
            writer.close();
            System.out.println("Written");
        } catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
    
}
