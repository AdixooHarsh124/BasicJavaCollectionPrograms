package concurrentHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Enumeration;
import java.util.Collections;
public class LinkedHashSetIteratorFailFast18
{
    public static void main(String args[]) {

        Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

        linkedLinkedHashSet.add("if ");
        linkedLinkedHashSet.add("Else");

        Iterator<String> iterator = linkedLinkedHashSet.iterator();
        while (iterator.hasNext()) {
            linkedLinkedHashSet.add("else if");
            System.out.println(iterator.next());
        }

        Enumeration<String> listEnum = Collections.enumeration(linkedLinkedHashSet);
        while (listEnum.hasMoreElements()) {
            linkedLinkedHashSet.add("switch");
            System.out.println(listEnum.nextElement());
        }

        for (String string : linkedLinkedHashSet) {
            linkedLinkedHashSet.add("while");
            System.out.println(string);
        }

    }
}
