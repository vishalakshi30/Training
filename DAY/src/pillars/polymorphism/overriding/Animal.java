package pillars.polymorphism.overriding;

public class Animal {
    void eat(){
        System.out.println("animal eats food!");
    }
    void sound(){
        System.out.println("animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks!");
    }
}
class Puppy extends Animal{
    void eat(){
        super.eat();
        System.out.println("puppy drinks milk");
    }
}
class main{
    public static void main(String[] args) {

        Animal animal=new Puppy();
        animal.eat();
        animal.sound();
    }
}