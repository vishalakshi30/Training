package Garbagecollections.eligibility;

public class Demo {
    public void finalize(){
        System.out.println("garbage collected!");
    }

    public static void main(String[] args) {
        for(int i=0; i<10000; i++){
            Demo obj=new Demo();
            obj=null;
        }
        System.gc(); //it is not compulsory to call gc every time
    }
}
