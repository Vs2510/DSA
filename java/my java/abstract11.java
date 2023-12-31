abstract class pen{
    abstract void refill();
    abstract void write();

        //System.out.println("");
    
}
class fountain extends pen{

    @Override
    void refill() {
        System.out.println("refilling");
        
    }

    @Override
    void write() {
        System.out.println("writing");
        
    }
    void changeNib(){
        System.out.println("fountain pen requires to change it's nib");
    }
    
}
public class abstract11 {
    public static void main(String[] args) {
       fountain f = new fountain();
       f.changeNib();
       f.refill();
       f.write();
    }
    
}
