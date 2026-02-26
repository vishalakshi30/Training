package Interface;
//why interfaces are not abstract??

public interface DEmo {
    void show();//abstract method

    default void display() { //default was introduced to abstract but will have body
        System.out.println("Default method!");
    }

    static void message() {//static was also introduced
        System.out.println("static method!");
    }
}

    class ChildDemo implements DEmo {
        public void show() {
            System.out.println("its show!");
        }
    }



    class Auto {
        public static void main(String[] args) {
            DEmo.message();
            ChildDemo obj=new ChildDemo();
            obj.show();
        }
    }

