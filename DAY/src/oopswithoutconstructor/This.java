package oopswithoutconstructor;

public class This {
        int i;
        void change(int x){
            i=x;
        }
        void change1(int i){
            i=i;        // creates confusion which i is equal to which i so we use this keyword
        }
        void change2(int i){
            this.i=i;   // this keyword refers to current class members
        }
        void display(){
            System.out.println("The value of i is: "+i);
        }

        public static void main(String[] args) {
            This d=new This();
            d.change(10);
            d.display();
        }
    }


