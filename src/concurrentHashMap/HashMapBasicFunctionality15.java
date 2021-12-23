package concurrentHashMap;
import java.util.Map;
import java.util.Hashtable;

public class HashMapBasicFunctionality15
{
    public static void main(String args[])
    {
        Map<Integer,String> hashtable=new Hashtable<Integer,String>();

        hashtable.put(1, "collections");
        hashtable.put(2, "Oops");
        hashtable.put(3, "exception Handiling");

        System.out.println("the value is  : "+hashtable.get(3));


        System.out.println("is key present or not : "+hashtable.containsKey(11));

        System.out.println("is value is present or not  "+hashtable.containsValue("file handling "));

        System.out.println("hashTable remove value is "+hashtable.remove(11));

        System.out.println("the hashtable size is"+hashtable.size());

    }
}
