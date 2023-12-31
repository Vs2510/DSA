class employee{
   // int id;
    String name;
    int salary;
    public void setName(String n){
        name =n;
    }
    public String getName (){
        return name;
    }
    public void setSalary (int s){
        salary=s;

    }
    public int getSalary (){
        return salary;
    }
}
public class practice {
    public static void main(String[] args) {
        employee harry = new employee();
        harry.setName("Harry");
        harry.setSalary(50000);
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());

    }
    
}
