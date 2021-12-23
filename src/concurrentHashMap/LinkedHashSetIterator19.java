package concurrentHashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Collections;
public class LinkedHashSetIterator19 {
    public static void main(String args[]) {

        Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

        linkedLinkedHashSet.add("inheritence");
        linkedLinkedHashSet.add("abstraction");

        Iterator<String> iterator = linkedLinkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Enumeration<String> listEnum = Collections.enumeration(linkedLinkedHashSet);
        while (listEnum.hasMoreElements()) {
            System.out.println(listEnum.nextElement());
        }


        for (String string : linkedLinkedHashSet) {
            System.out.println(string);
        }

    }
}
