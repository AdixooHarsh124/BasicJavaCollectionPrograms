package concurrentHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

public class TreeIterationPartTwo {
    public static void main(String args[])
    {

        Map<Integer,String> treeMap=new TreeMap<Integer,String>();
        treeMap.put(1,"list");
        treeMap.put(2,"queue");
        treeMap.put(3,"set");
        Iterator<Integer> keyIteratorFromBase=treeMap.keySet().iterator();
        while(keyIteratorFromBase.hasNext())
        {
//            System.out.println(keyIteratorFromBase);
        }

        Set<Integer> keyIteratorFromSet=treeMap.keySet();
        for(Integer key:keyIteratorFromSet)
        {
//            System.out.println(key);
        }

        Iterator<String> valueIteratorFormBase=treeMap.values().iterator();
        while(valueIteratorFormBase.hasNext())
        {
//            System.out.println(valueIteratorFormBase);
        }

        Collection<String> valueIteratorFromCollection=treeMap.values();
        for(String value:valueIteratorFromCollection)
        {
//            System.out.println(valueIteratorFromCollection);
        }

        Iterator<Entry<Integer,String>> entryIteratorFromBase=treeMap.entrySet().iterator();
        while(entryIteratorFromBase.hasNext())
        {
//            System.out.println(entryIteratorFromBase);
        }

        Set<Entry<Integer,String>> entryIteratorFromSet=treeMap.entrySet();
        for(Entry <Integer,String> entry:entryIteratorFromSet)
        {
//            System.out.println(entry);
        }
    }
}
