//package shapes;
class rectangle {
    int length,breadth,area;
    public int getlength(){
        return length;
    }
    public void setlength(int l){
        this.length=l;
    }
    public int getbreadth(){
        return breadth;
    }
    public void setbreadth(int b){
        this.breadth=b;
    }
    public int getarea(){
        return length * breadth;
    }
}
class circle extends rectangle{
    int radius , Area;
    public void setradius(int r){
        this.radius=r;
    }
    public int getradius(){
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
public class shape {
    public static void main(String[] args) {
       /* rectangle z = new rectangle();
        z.setbreadth(5);
        z.setlength(7);
        System.out.println(z.getarea()); */
       /* circle w = new circle();
        w.setradius(1);
        System.out.println(w.getArea()); */ 
      /*   circle q = new circle();
        q.setlength(9);
        q.setbreadth(5);
        System.out.println(q.getarea()); */
        
    }
    
}
