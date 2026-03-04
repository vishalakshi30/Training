package Abstraction;

abstract class Vehicle {
    abstract void color();

    void model() {

        System.out.println("it is 4 vehicle model");
    }
}
class Car extends Vehicle{
    void color(){

        System.out.println("it is white in colour");
    }
}
class Jeep extends Vehicle{
    void color(){
        System.out.println("its black in colour");
    }
}
    class Demo{
        public static void main(String[] args) {
            Car c=new Car();
            c.color();
            c.model();
            Jeep j=new Jeep();
            j.color();
            j.model();

    }
}