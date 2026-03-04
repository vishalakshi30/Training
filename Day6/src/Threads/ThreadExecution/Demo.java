package Threads.ThreadExecution;

import ExceptionHandling.E4;

class MyThread extends Thread{
    public void run(){
        for(int  i=0; i<=5; i++){
            System.out.println("child:"+i);
            try{
                Thread.sleep(1000); //it always throws checked exception

            }catch(Exception e){}
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
    }
}
