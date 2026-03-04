package Strings;

public class StringOperationsDemo {
    public static void main(String[] args) {

        //created string
        String s1 = "Java programming";
        String s2 = new String("Java programming");
        System.out.println("Original String:" + s1);

        //length()(to get the length of string)
        System.out.println("Length is:" + s1.length());

        //chartAt(to access particular character)
        System.out.println("Character at index 2:" + s1.charAt(2));

        //toUpperCase() and toLowerCase()
        System.out.println("UPPERCASE:" + s1.toUpperCase());
        System.out.println("lowercase:" + s1.toLowerCase());

        //equals and ==
        System.out.println("using:" + s1 == s2);
        System.out.println("using equals():" + s1.equals(s2));

        //CompareTo() it does compare lexicographical values(ascii value)
        //(0,s1&s2 same  +ve s1>s2   -ve s2>s1)
        System.out.println("using compareTo():" + s1.compareTo(s2));

        //substring()
        System.out.println("Substring(0 to 4):" + s1.substring(0, 4));

        //contain()(checks whether it contains or not )
        System.out.println("contains 'program:" + s1.contains("program"));

        //indexOf()(gives the index of char)
        System.out.println("index of a:" + s1.indexOf('a'));

        //replace (it replaces but s1 remains unmodified)
        System.out.println("Replace java with python:" + s1.replace("java", "python"));

        //startWith() & endWith()
        System.out.println("starts with java: " + s1.startsWith("Java"));
        System.out.println("ends with java: " + s1.endsWith("mming"));

        //trim()
        String s3 = "    Ashank    ";
        System.out.println("Before trim: " + s3);
        System.out.println("After trim: " + s3.trim());

        //concat()
        System.out.println("Concat(): " + s1.concat(" Language"));

        //isEmpty()
        String str = "";
        System.out.println("IS Empty?: " + str.isEmpty());

        //split()
        String sentence = "Java is a very easy language to learn!";
        String arr[] = sentence.split(" ");
        for (String i : arr) {
            System.out.println(i);
        }

    }

}

