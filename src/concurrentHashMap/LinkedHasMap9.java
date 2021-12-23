package concurrentHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
public class LinkedHasMap9 {
    public static void main(String args[]){


        Map<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();

        linkedHashMap.put(1, "java se dar nahi lagta sahab ");
        linkedHashMap.put(2, "css se lagra he");



        Iterator<Integer> keyIterator=linkedHashMap.keySet().iterator();
        while(keyIterator.hasNext()){
            System.out.println(keyIterator.next());
        }


        Set<Integer> keySet=linkedHashMap.keySet();
        for(Integer key :keySet){
            System.out.println(key);
        }




        Iterator<String> valueIterator=linkedHashMap.values().iterator();
        while(valueIterator.hasNext()){
            System.out.println(valueIterator.next());
        }

        Collection<String> collection=linkedHashMap.values();
        for(String value :collection){
            System.out.println(value);
        }




        Iterator<Entry<Integer, String>> entryIterator=linkedHashMap.entrySet().iterator();
        while(entryIterator.hasNext()){
            System.out.println(entryIterator.next());
        }


        Set<Entry<Integer, String>> entrySet=linkedHashMap.entrySet();
        for(Entry<Integer, String> entry:entrySet){
            System.out.println(entry);
        }

    }
}
