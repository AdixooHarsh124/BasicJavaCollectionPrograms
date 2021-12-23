package concurrentHashMap;
import java.util.Map;
import java.util.Hashtable;
import java.util.Collections;
public class HashTableUnModification12 {
    public static void main(String args[]){

        Map<Integer,String> hashtable=new Hashtable<Integer,String>();

        hashtable.put(11, "c");
        hashtable.put(21, "angular");
        hashtable.put(31, "springBoot");


        Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(hashtable);

        unmodifiableMap.put(41,"dotNet");
    }
}
