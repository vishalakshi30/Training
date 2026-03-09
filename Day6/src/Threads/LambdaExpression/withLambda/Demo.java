package Threads.LambdaExpression.withLambda;

interface Greetings{
    void sayHello();
}

public class Demo {
    public static void main(String[] args) {
        Greetings g = () -> { //lambda function
              System.out.println("hello world");
            };
            g.sayHello();
        }
    }


/*
->lambda function is used only when the interface has one method
->not recommended to use when interface has more than one method
 */