package pillars.inheritance.multilevel;

public class SimpleCalculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }
}
    class AdvancedCalculator extends SimpleCalculator {
        void subtract(int a, int b) {
            System.out.println(a - b);
        }
    }
        class SuperAdvancedCalculator extends AdvancedCalculator{
            void product(int a, int b){
                System.out.println(a*b);
            }
            void square(int a){
                System.out.println(a*a);
            }
        }
        class MultilevelDemo{
            public static void main(String[] args){
                System.out.println("========================================");
                SimpleCalculator c1=new SimpleCalculator();
                c1.add(1,3);
                System.out.println("========================================");
                AdvancedCalculator c2=new AdvancedCalculator();
                c1.add(1,3);
                c2.subtract(6,3);
                System.out.println("========================================");
                SuperAdvancedCalculator c3=new SuperAdvancedCalculator();
                c1.add(1,3);
                c2.subtract(6,3);
                c3.product(2,3);
                c3.square(5);
            }
        }





