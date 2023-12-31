package code;
interface gps{
    void location();
}
interface camera{
    void pics();
}
interface music{
    void musicApps();
}
class smartphone implements gps,camera,music{

    @Override
    public void musicApps() {
        System.out.println("Different types of apps to listen music");   
    }

    @Override
    public void pics() {
        System.out.println("Clicks various pics");  
    }

    @Override
    public void location() {
        System.out.println("Can track location ");
        
    }

}
public class poly {
    public static void main(String[] args) {
        gps g = new smartphone();
        g.location();
        music m = new smartphone();
        m.musicApps();
        camera c = new smartphone();
        c.pics();
    }

    
}
