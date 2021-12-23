package concurrentHashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.Iterator;

public class LinkedHashSetSynchronizing16 {
    public static void main(String args[]) {

        Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

        linkedLinkedHashSet.add("set");
        linkedLinkedHashSet.add("Iterator");

        Set<String> synchronizedSet = Collections.synchronizedSet(linkedLinkedHashSet);



        synchronized (synchronizedSet) {
            Iterator<String> iterator = synchronizedSet.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
