package Generics;

class Test<T>{
    T obj;
    Test(T obj){//constructor
        this.obj=obj;
    }
}

public class GenericDemo1 {
    public static void main(String[] args) {
        Test<Integer> obj1=new Test<>(15);
        Test<String>  obj2=new Test<>("Hello");
    }
}
