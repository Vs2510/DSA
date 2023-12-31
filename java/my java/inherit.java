class b12{
    public void cam(){
        System.out.println("A very simple kind of camera");
    }
    public void call (){
        System.out.println("Supports calling");
    }
}
class a22 extends  b12{
    public void selfie (){
        System.out.println("Efficient of taking selfies as well!!");
    }
    public void calls (){
        System.out.println("Supports LTE and VOLTE calls as well ");
    }

}
public class inherit {
    public static void main(String[] args) {
        a22 a=new a22();
        a.cam();
        a.call();
        a.selfie();
        a.calls();

        
    }
    
}
