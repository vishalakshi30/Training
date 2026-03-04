package Interface;

public interface Vehicle {
    void start();
    default void stop(){
        System.out.println("Engine stopped!");
    }
}
class Audi implements Vehicle{
    public void start(){
        System.out.println("Audi has started!");
    }
}
class BMW implements Vehicle{
    public void start(){
        System.out.println("BMW has started");
    }
}
class Bike implements Vehicle {
    public void start(){
        System.out.println("bike started!");
    }
    public void stop() {
        System.out.println("Bike stopped");
    }
}
class Example{
    public static void main(String[] args) {
        Audi a=new Audi();//1st way to access default method
        a.stop();
        Vehicle v=new BMW();//upcasting (run time polymorphism)2nd way
        v.stop();
        Bike b=new Bike();
        b.stop();
}
}