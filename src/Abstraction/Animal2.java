package Abstraction;

abstract class Animal2 {
    Animal2(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}
class Dog extends Animal2{
    Dog(){
        System.out.println("Dog Constructor");
    }
    void sound(){
        System.out.println("dog barks");

    }
}
class Vish{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}
/*
why does abstract class have constructor??
-> constructor are used for initializing common data!
->when a child class object is created, the parent class constructor runs first
->Parent constructor is getting executed because of inheritance
 */