package Abstraction;

abstract class Animal {
    abstract void sound();//abstraction(it cannot have body)

    void run(){
        System.out.println("Running..");

    }
}
class Lion extends Animal {
    void sound() {
        System.out.println("Roars");
    }
}
class Cat extends Animal{
    void sound(){

        System.out.println("meow");
    }
}

    class Driver{
        public static void main(String[] args) {
            Lion l = new Lion();
            l.sound();
            l.run();
            Cat c=new Cat();
            c.sound();
            c.run();
        }
    }
