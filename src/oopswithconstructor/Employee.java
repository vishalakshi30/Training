package oopswithconstructor;

public class Employee {
    String name;
    int emp_id;
    public Employee(String name, int emp_id){
        this.name=name;
        this.emp_id=emp_id;
    }
    void display(){
        System.out.println(emp_id +" "+name);

    }
    //static copy method
    static Employee copy(Employee e){
        return new Employee(e.name ,e.emp_id);
    }
    public static void main(String[] args){
        Employee e1=new Employee("vish",101);
        Employee e2=Employee.copy(e1);//correct use
        //Employee e3=e2;not recommended!can lead to errors!
        e2.display();
    }
    static {//will always execute in the beginning
        System.out.println("start of the execution!");
        System.out.println("Db-loading");
        System.out.println("internet protocols loading");
        //requirements.txt
    }

}
