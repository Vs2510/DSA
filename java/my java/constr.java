class  newEmployee{
    public newEmployee(){
        name ="jai";
        salary = 40000;
    }
    public newEmployee( String name,int salary){
           this.name=name;
           this.salary=salary;
    }
    public newEmployee (String name,int salary,int id){
        this.name=name;
        this.salary=salary;
        this.id=id;

    }
     int id;
      private String name;
       private int salary;
     public void setName(String n){
          this.name =n;
     }
     public String getName (){
         return name;
     }
     public void setSalary (int s){
         this.salary=s;
 
     }
     public int getSalary (){
         return salary;
     }
     public void setId (int i){
        this.id=i;
     }
     public int getId (){
        return id;
     }
 }
public class constr {
    public static void main(String[] args) {
        newEmployee e= new newEmployee();
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println();
        System.out.println(" Another one:  ");
        System.out.println();
        newEmployee e1=new newEmployee("Akash",50000);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        System.out.println();
        System.out.println("Here comes the third one");
        System.out.println();
        newEmployee e2= new newEmployee("Priya",50000,24);
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());
        System.out.println(e2.getId());

        
        
    }
    
}
