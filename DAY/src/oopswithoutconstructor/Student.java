package oopswithoutconstructor;

public class Student {
        int usn;
        String name;
        int marks;

        //method

        void evaluateMarks() {
            if (marks >= 40) {
                System.out.println(name + " has passed");
            } else {
                System.out.println(name + " has failed");
            }
        }
        public static void main(String args[]){
            Student s1=new Student();
            s1.name="vish";
            s1.usn=126;
            s1.marks=90;
            s1.evaluateMarks();


        }

    public static class This {
        String i;//INSTANCE VARIABLE
        void change(String i){
            this.i=i;//TO REMOVE CONFUSION(AMBIGUITY)

        }
        void display(){
            System.out.println("the value of i is:" +i);
        }
        public static void main(String args[]){
            This d=new This();
            d.change("CSE");
            d.display();

        }
    }
}




