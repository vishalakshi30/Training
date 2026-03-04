package Strings.BufferBuilder;

public class StringBuilderExample {

        public void StringAppend(){
            StringBuilder sb=new StringBuilder("Hello");
            System.out.println("old string: "+sb);
            sb.append(" world!");
            System.out.println("new string:"+sb);

        }
        public void StringInsert() {
            StringBuilder sb=new StringBuilder("Hello");
            System.out.println("old string: "+sb);
            sb.insert(1,"EEE");
            System.out.println("new string:"+sb);

        }
    public void StringReverse() {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("old string: "+sb);
        sb.reverse();
        System.out.println("new string:"+sb);

    }

        public static void main(String[] args) {
            StringBuilderExample obj =new StringBuilderExample();
            obj.StringAppend();
            obj.StringReverse();
            obj.StringInsert();
        }

    }


