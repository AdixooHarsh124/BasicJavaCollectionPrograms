package concurrentHashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Map.Entry;
public class HashTableIteration13 {
    public static void main(String args[]){


        Map<Integer,String> hashtable=new Hashtable<Integer,String>();
        hashtable.put(1, "marker");
        hashtable.put(2, "inkpot");

        Iterator<Integer> keyIterator=hashtable.keySet().iterator();
        while(keyIterator.hasNext()){
            hashtable.put(3,"dustor");
            System.out.println(keyIterator.next());
        }



        Iterator<String> valueIterator=hashtable.values().iterator();
        while(valueIterator.hasNext()){
            hashtable.put(4,"whiteboard");
            System.out.println(valueIterator.next());
        }


        Iterator<Entry<Integer, String>> entryIterator=hashtable.entrySet().iterator();
        while(entryIterator.hasNext()){
            hashtable.put(5,"last me");
            System.out.println(entryIterator.next());
        }

    }
}
