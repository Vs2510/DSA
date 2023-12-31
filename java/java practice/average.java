package calculation;
public class average {
    public int avg(int a, int b, int c){
        int r= (a+b+c)/3;
        return r;
    }
    public static void main(String[] args) {
        average ar=new average();
       System.out.println( ar.avg(3, 3, 3));
        
    }

    
}
