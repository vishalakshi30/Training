package Threads.ThreadJoin.E2;

class MyThread implements Runnable{
     public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("child:"+i);
        }
    }
}

public class Demo {
    public static void main(String[] args) throws Exception {
        MyThread obj=new MyThread();
        Thread t1=new Thread(obj);
        t1.start();
        //try {
        t1.join();
        //}catch(Exception e){}
        System.out.println("Main Thread Finished");
    }
}
