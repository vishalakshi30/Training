package CollectionFrameWork;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        //put()->inserts key-value pair
        map.put(1, "ashank");
        map.put(2,"David");
        map.put(3,"Sapthagiri");

        //get()-->retrieve the val
        System.out.println(map.get(1));

        //containskey()
        System.out.println(map.containsKey(1));

        //remove()
        map.remove(1);
        System.out.println(map);


    }
}
/*
*stores the element as key-value pair
* key must be unique
* values can be duplicated
* does not maintain the insertion order
* uses hashing internally
* here we use -put(), get(), remove(), containskey(),important ones
 */
