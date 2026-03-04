package Threads.WaysOfCreatingThreads.ThreadClass.E2;
//multithread(but it is not necessary that the main function should run faster)
//because thread is independent of execution
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("My Thread:" + i);

        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread:" + i);
        }

    }
}
/*
start() creates new Thread
run() contains logic
output order is unpredictable
Both threads run independently
 */