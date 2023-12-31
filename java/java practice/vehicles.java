//package transportation;
interface cycle{
    void speed();
    void ringing();
}
interface bike extends cycle{
    void motor();
    void horn();

}
interface rover{
    void speeding();
}

class transports  implements bike,rover {

    @Override
    public void speed() {
        System.out.println("Cycle has slow speed");
        
    }

    @Override
    public void ringing() {
        System.out.println("cycle has less bell");
        
    }

    @Override
    public void motor() {
        System.out.println("bike has powerful engine");
        
    }

    @Override
    public void horn() {
        System.out.println("bike has loud noise");
        
    }

    @Override
    public void speeding() {
        System.out.println("car is fastest");
        
    }
    
}
public class vehicles {
    public static void main(String[] args) {
        transports t=new transports();
        t.horn();
        t.motor();
        t.speed();
        t.ringing();
        t.speeding();
    }
    
}
