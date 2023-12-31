
class MyThread1 extends Thread{
    public static void runin(){
        int i=0;
        while(i<10){
            System.out.println("i am coding");
            i++;
        }

    }
}
class MyThread2 extends Thread{
    public static void runin(){
        int i=0;
        while(i<10){
        System.out.println("i am cookin also!!");
i++;
        }

    }
}
public class threadcreatingbyextendingthread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2 =new MyThread2();
        t1.start();;
        t2.start();
        
    }
    
    

    
}
