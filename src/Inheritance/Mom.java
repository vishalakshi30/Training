package Inheritance;
interface Mom {
    default void cook() {
        System.out.println("Indian");
    }
}

interface Dad {
    default void cook() {
        System.out.println("Chinese");
    }

}


class Child implements Mom, Dad {
    public void cook() {
        //System.out.println("Indian");
        Mom.super.cook();
    }
}



class Example {
    public static void main(String[] args) {
        Child c = new Child();
        c.cook();

    }
}

