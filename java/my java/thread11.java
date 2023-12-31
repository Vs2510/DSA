class MyThread extends Thread{
    public void run(){
        int i=0;
        while (i<50){
            System.out.println("Running");
            i++;

        }
    }

}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while (i<50){
            System.out.println("Running again (MORE PRIORITY) ");
            i++;

        }
    }

}
public class thread11 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        
        
    }
    
}
