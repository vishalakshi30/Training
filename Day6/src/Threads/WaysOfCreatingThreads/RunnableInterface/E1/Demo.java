package Threads.WaysOfCreatingThreads.RunnableInterface.E1;
//when we use implements the class becomes task
class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running");

    }

}

public class Demo {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.start();
        t2.start();
    }
}
