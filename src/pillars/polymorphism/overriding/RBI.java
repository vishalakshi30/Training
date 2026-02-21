package pillars.polymorphism.overriding;

public class RBI {
        double rateOfIntrest(){
            return 6.5;
        }
    }
    class ICICI extends RBI{
        @Override
        double rateOfIntrest(){
            return 7.2;
        }
    }
    class HDFC extends RBI{
        @Override
        double rateOfIntrest(){
            return 7.8;
        }
    }
    class Demo {


        public static void main(String[] args) {
            RBI rbi = new RBI();
            RBI icici = new ICICI();
            RBI hdfc = new HDFC();
            System.out.println("RBI rateOfIntrest:" + rbi.rateOfIntrest());
            System.out.println("ICICI rateOfIntrest:" + icici.rateOfIntrest());
            System.out.println("HDFC rateOfIntrest:" + hdfc.rateOfIntrest());
        }
    }
