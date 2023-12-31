interface bicycle{
    void applybrakes();
    void speedup();
}
class avon implements bicycle{

    @Override
    public void applybrakes() {
        System.out.println("Stop");
        
    }

    @Override
    public void speedup() {
        System.out.println("increase speed");
        
    }
    public void horn(){
        System.out.println("Cycle has a bell as horn");
    }
    
}
public class interace12 {
    public static void main(String[] args) {
        avon av = new avon();
        av.applybrakes();
        av.speedup();
        av.horn();
        
    }
    
}
