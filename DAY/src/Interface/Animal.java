package Interface;

public interface Animal {//interface is whole new class
    void sound(); //cannot have body(if default is used then it should have body)
    void run();
 }

class Lion implements Animal{//interface(implements)
     public void sound(){
        System.out.println("roar");
    }
     public void run(){
        System.out.println("running");
    }
}
//interface forces the methods to be public.if not they become package private
