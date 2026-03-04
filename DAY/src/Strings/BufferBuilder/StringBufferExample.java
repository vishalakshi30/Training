package Strings.BufferBuilder;

public class StringBufferExample {

    public void StringAppend() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("old string: " + sb);
        sb.append(" world!");
        System.out.println("new string:" + sb);

    }
    public void StringInsert() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("old string: " + sb);
        sb.insert(1, "EEE");
        System.out.println("new string:" + sb);

    }

    public void StringReverse() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("old string: " + sb);
        sb.reverse();
        System.out.println("new string:" + sb);

    }

    public static void main(String[] args) {
        StringBufferExample obj = new StringBufferExample();
        obj.StringAppend();
        obj.StringReverse();
        obj.StringInsert();
    }
}