//package mobiles;
class b12{
    public void camera(){
        System.out.println("it has a very low quality camera");
    }
    public void calling(){
        System.out.println("just a voice calling");
    }
}
class a22 extends b12{
    public void cam(){
        System.out.println("high quality camera");
    }
    public void connectivity(){
        System.out.println("it supports 5g with hd video and voice calls");
    }
}
public class phones {
    public static void main(String[] args) {
        a22 p=new a22();
        p.camera();
        p.calling();
        p.cam();
        p.connectivity();
        
    }
    
}
