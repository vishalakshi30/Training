package oopswithconstructor;

public class ConstructorChaining {
    int id;
    String name;
    double salary;
    static String company="TCS";
    ConstructorChaining(){
        this(0,"not assigned",0.0);
    }
    public ConstructorChaining(int id, String name){
        this(id,name,3000);
    }
    public ConstructorChaining(int id, String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    void display(){
        System.out.println(id + " " + name +" "+ salary);
    }
    public static void main(String[] args){
        ConstructorChaining e1=new ConstructorChaining();
        ConstructorChaining e2=new ConstructorChaining(101,"vish");
        ConstructorChaining e3=new ConstructorChaining(302,"vishalakshi",45000);
        e1.display();
        e2.display();
        e3.display();
    }

}
