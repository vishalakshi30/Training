package CollectionFrameWork;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet <Integer> set=new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        System.out.println(set);

        System.out.println(set.contains(20));
        set.remove(30);
        System.out.println(set.size());
    }
}

/*
*no duplicates are allowed
* no order of insertion is maintained
* uses hashing internally
* very fast add remove &search operations
* no indexes
 */