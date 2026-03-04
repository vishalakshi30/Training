package InnerClasses.Memberclass;

public class Outer {
    private int x = 10;

    class Inner {
        void display() {
            System.out.println("The value of x is:" + x);
        }
    }
}
class Demo {
    public static void main(String[] args) {
        Outer out = new Outer();
        //outerClass.InnerClass in_obj=out_obj.new InnerClass();
        Outer.Inner in = out.new Inner();
        in.display();
    }
}

