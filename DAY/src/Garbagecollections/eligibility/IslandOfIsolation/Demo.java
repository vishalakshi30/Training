package Garbagecollections.eligibility.IslandOfIsolation;

public class Demo {
    Demo ref; // it will hold the adress of upcoming object
}
class Driver{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Demo obj2=new Demo();

        obj1.ref=obj2;
        obj2.ref=obj1;

        obj1=null;
        obj2=null;
    }
}