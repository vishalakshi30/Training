package pillars.inheritance.singlelevel;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
}
class Student extends Person{
    int usn;
    Student(int usn,String name){
        super(name);
        this.usn=usn;
    }
    void display(){
        System.out.println(usn + " "+name);
    }
    public static void main(String[] args){
        Student s=new Student(126,"vish");
        s.display();
    }
}
/*
point to remember:
1.super.something->variable or method from parent class
2.super()->parent class constructor
3.super.->dont use for constructor
 */