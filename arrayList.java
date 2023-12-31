import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        /*  Wrapper class  
         * a class whose object contains primitive data types
         * int ---- Integer,float---- Float and so on
        */
        // initialisation
        Integer i =Integer.valueOf(5);
        System.out.println(i);
        // Here i is the object of Integer class (wrapper) to go with oops functionality of java 
        // if we write int i=4 then i is a variable not a object.

        /* ArrayList */
        /* An array cannot be resized but we can resize an arrayList
         *  ArrayList<Integer> a=new ArrayList<>();
         */
        ArrayList<Integer> a=new ArrayList<>();

        a.add(5);
        a.add(7);
        a.add(4);
        a.add(10);
        a.add(9);

      //  a.get(0);
      // int n= a.size();
      // System.out.println(n);
       a.add(1,54);
       a.remove(1);
       System.out.println(a);
       boolean a1=a.contains(4);
       System.out.println(a1);
       Collections.sort(a);
       System.out.println(a);
       // if we don't specify any type then we can add anything to the arraylist
       //Arraylist l=new Arraylist();
      /*  ArrayList a2=new ArrayList();
       a2.add("Vaibhav");
       a2.add(25);
       System.out.println(a2);
*/
    }
    
}
