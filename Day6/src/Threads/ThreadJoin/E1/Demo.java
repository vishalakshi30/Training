package Threads.ThreadJoin.E1;

class MyThread extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("child:"+i);
        }
    }
}

public class Demo {
    public static void main(String[] args) throws Exception{
        MyThread t1=new MyThread();
        t1.start();
        //try {
            t1.join();
        //}catch(Exception e){}
        System.out.println("Main Thread Finished");
    }
}
