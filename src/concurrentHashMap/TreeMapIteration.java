package concurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//Fail-safe iterators means they will not throw any exception even if the collection is
// modified while iterating over it. ... Whereas Fail-fast iterators throw an exception(ConcurrentModificationException)
// if the collection is modified while iterating over it.
public class TreeMapIteration
{
    public static void main(String args[])
    {
       Map<Integer, String> treeMap=new TreeMap<Integer, String>();
       treeMap.put(1,"react");
       treeMap.put(2,"angular");

       Iterator<Integer> IteratorIntegerTree=treeMap.keySet().iterator();
       while(IteratorIntegerTree.hasNext())
       {
        treeMap.put(3,"python");
//        System.out.println(IteratorIntegerTree.hasNext());
       }


       Iterator<String> IteratorStringTree=treeMap.values().iterator();
       while(IteratorStringTree.hasNext())
       {
           treeMap.put(4,"dotNat");
           System.out.println(IteratorStringTree.hasNext());
       }


       Iterator<Entry<Integer,String>> IteratorEntryPoint=treeMap.entrySet().iterator();
       while(IteratorEntryPoint.hasNext())
       {
           treeMap.put(5,"java");
           System.out.println("entry"+IteratorEntryPoint.hasNext());
       }

    }
}
