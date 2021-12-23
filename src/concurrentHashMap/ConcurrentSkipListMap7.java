package concurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
public class ConcurrentSkipListMap7
{
    public static void main(String args[])
    {
        Map<Integer,String> concurrentSkipListMap=new ConcurrentSkipListMap<Integer,String>();
        concurrentSkipListMap.put(1, "try{}Catch(){}");
        concurrentSkipListMap.put(2, "try{}Catch(){}");
        concurrentSkipListMap.put(3, "tyr{}Catch(){}finally{}");

        System.out.println("the value is : "+concurrentSkipListMap.get(2));

        System.out.println("is key present or not: "+concurrentSkipListMap.containsKey(3));


        System.out.println("is value present or not  "+concurrentSkipListMap.containsValue("try{}finally{}"));

        System.out.println("is value remove or not  "+concurrentSkipListMap.remove(2));



        System.out.println("size in int : "+concurrentSkipListMap.size());

    }
}


