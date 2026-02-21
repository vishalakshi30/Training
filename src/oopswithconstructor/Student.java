package oopswithconstructor;

public class Student {
    int usn;
    String name;
    int marks;
    //static is not for object-it directly belongs to class
    static String college="SNPSU";//use for common parameters
    Student(int usn, String name, int marks){
        this.usn=usn;
        this.name=name;
        this.marks=marks;
    }

    //method

    void evaluateMarks() {
        if (marks >= 40) {
            System.out.println(name + " has passed");
        } else {
            System.out.println(name + " has failed");
        }
    }
    void studentDetails(){
        System.out.println("name: " +this.name);
        System.out.println("usn: " +this.usn );
        System.out.println("marks: " +this.marks);
        System.out.println("college:" +college);
    }
    public static void main(String args[]){
        Student s1=new Student(126, "vish", 90);
        Student s2=new Student(125, "vishala", 40);
        s1.evaluateMarks();
        s2.evaluateMarks();
        s1.studentDetails();
        s2.studentDetails();


    }
}



