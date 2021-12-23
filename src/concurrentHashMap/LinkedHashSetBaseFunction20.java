package concurrentHashMap;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetBaseFunction20
{
    public static void main(String args[]) {

        Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();
        linkedLinkedHashSet.add("set");
        linkedLinkedHashSet.add("queue");
        linkedLinkedHashSet.add("link");

        System.out.println("Link HashSet is "+linkedLinkedHashSet);
        System.out.println("HashSet Empty or not  "+linkedLinkedHashSet.isEmpty());


        linkedLinkedHashSet.clear();

        System.out.println("is linkedHashSet empty or not  "+linkedLinkedHashSet.isEmpty());




    }
}
