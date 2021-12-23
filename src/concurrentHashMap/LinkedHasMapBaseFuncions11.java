package concurrentHashMap;
import java.util.Map;
import java.util.LinkedHashMap;
public class LinkedHasMapBaseFuncions11
{
    public static void main(String args[])
    {

        Map<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();


        linkedHashMap.put(1, "loop");
        linkedHashMap.put(2, "Iterator");
        linkedHashMap.put(3, "continue");


        System.out.println("the value is "+linkedHashMap.get(3));


        System.out.println("is key present or not : "+linkedHashMap.containsKey(1));


        System.out.println("is value present or not  "+linkedHashMap.containsValue("conditon"));

        System.out.println("the removed value is "+linkedHashMap.remove(6));



        System.out.println("the size is  "+linkedHashMap.size());

    }
}
