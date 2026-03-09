package Threads.LambdaExpression.WithRunnableInterface.OldWay;

//when we use implements the class becomes task
//class MyTask1 implements Runnable{
    //public void run(){
        //System.out.println("Task1 is running");

   // }

//}
//class MyTask2 implements Runnable {
    //public void run() {
        //System.out.println("Task2is running");
    //}
//}



public class Demo {
    public static void main(String[] args) {
        //MyTask1 obj1=new MyTask1();
        //MyTask2 obj2=new MyTask2();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("my task1 is running!");

            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Mytask2 is running!");

            }
        });
        t1.start();
        t2.start();
    }
}

