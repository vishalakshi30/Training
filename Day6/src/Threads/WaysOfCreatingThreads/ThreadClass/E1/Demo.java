package Threads.WaysOfCreatingThreads.ThreadClass.E1;
//multiple threaded program
class MyThread extends Thread {//1 thread class
    public void run(){//predefined overriden function
        System.out.println("Thread is running");
    }
}
public class Demo{ //2 thread class
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start(); //when we use run here it becomes normal function
        System.out.println("Main thread is running");
    }
}