package concurrentHashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Collections;
public class LinkedHashSetUnmodifiable17
{
    public static void main(String args[])
    {

        // creates array with initial capacity of 10.
        Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

        linkedLinkedHashSet.add("set");
        linkedLinkedHashSet.add("queue");
        linkedLinkedHashSet.add("list");

        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedLinkedHashSet);

        unmodifiableSet.add("Map");
    }
}
