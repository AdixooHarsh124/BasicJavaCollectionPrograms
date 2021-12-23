package concurrentHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
public class HashTableONKeyValueEntry14 {
    public static void main(String args[]){


        Map<Integer,String> hashtable=new Hashtable<Integer,String>();

        hashtable.put(1, "fail-fast");
        hashtable.put(2, "fail-safe");

        Iterator<Integer> keyIterator=hashtable.keySet().iterator();
        while(keyIterator.hasNext()){
            System.out.println(keyIterator.next());
        }


        Set<Integer> keySet=hashtable.keySet();
        for(Integer key :keySet){
            System.out.println(key);
        }

        Iterator<String> valueIterator=hashtable.values().iterator();
        while(valueIterator.hasNext()){
            System.out.println(valueIterator.next());
        }


        Collection<String> collection=hashtable.values();
        for(String value :collection){
            System.out.println(value);
        }

        Iterator<Entry<Integer, String>> entryIterator=hashtable.entrySet().iterator();
        while(entryIterator.hasNext()){
            System.out.println(entryIterator.next());
        }

        Set<Entry<Integer, String>> entrySet=hashtable.entrySet();
        for(Entry<Integer, String> entry:entrySet){
            System.out.println(entry);
        }

    }

}
