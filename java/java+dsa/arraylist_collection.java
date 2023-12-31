import java.util.ArrayList;
import java.util.List;

//import javax.swing.SpinnerDateModel;

public class arraylist_collection {
    public static void main(String[] args) {
        List <Integer> c=new ArrayList<>();
        c.add(10);
        c.add(20);
      //  System.out.println(c);
        int d = c.get(1);
        System.out.println(d);
        c.set(0, 50);
        System.out.println(c);
        boolean f=c.contains (20);
        System.out.println(f);
        System.out.println(c.size());
    
        
    }
    
}
