class A extends Thread{
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println("Class A thread starts"+i);
           /*  try{
                sleep(50);
                System.out.println("Slept");
            } catch(Exception e){} */
        }
        System.out.println("Thread  A ends");
    }
}
class B extends Thread{
    public void run(){
    for(int j=1;j<=50;j++){
        System.out.println("class B thread starts:" +j);
    }
    System.out.println("Thread B ends");
}

} 
class C extends Thread{
    public void run(){
    for(int j=1;j<=50;j++){
        System.out.println("class C thread starts:" +j);
    }
    System.out.println("Thread C ends");
}

} 
public class thread_creation{
    public static void main(String[] args) {
        A a=new A();
        a.setPriority(Thread.MIN_PRIORITY);
        a.start();
        B b = new B();
        b.start();
        C c= new C();
        c.setPriority(Thread.MAX_PRIORITY);
        c.start();

        
    }
}