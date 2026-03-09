package WrapperClasses.ManualBoxing;

public class WrapperDemo {
    public static void main(String[] args) {
        int x=10;
        Integer obj=new Integer(x);//manual boxing

        System.out.println("Manual Value "+x);
        System.out.println("object val " +obj);

    }
}
