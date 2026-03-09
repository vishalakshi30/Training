package Threads.LambdaExpression.withoutLambda;

interface Greeting{//interfaces cannot be instantiated
    void sayHello();
}

public class Demo {
    public static void main(String[] args) {
        Greeting g=new Greeting() { //anonymous class
            @Override
            public void sayHello() {
                System.out.println("HelloWorld!");
            }
        };
        g.sayHello();
    }
}
