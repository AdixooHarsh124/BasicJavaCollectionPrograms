package concurrentHashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapFailSafeAnsFailFast10 {
    public static void main(String args[]){


        Map<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();

        linkedHashMap.put(1, "collection");
        linkedHashMap.put(21, "Map");



        Iterator<Integer> keyIterator=linkedHashMap.keySet().iterator();
        while(keyIterator.hasNext()){
            linkedHashMap.put(4,"4th one");
            System.out.println(keyIterator.next());
        }



        Iterator<String> valueIterator=linkedHashMap.values().iterator();
        while(valueIterator.hasNext()){
            linkedHashMap.put(4,"4th one");
            System.out.println(valueIterator.next());
        }

        Iterator<Entry<Integer, String>> entryIterator=linkedHashMap.entrySet().iterator();
        while(entryIterator.hasNext()){
            linkedHashMap.put(4,"4th one");
            System.out.println(entryIterator.next());
        }

    }
}
