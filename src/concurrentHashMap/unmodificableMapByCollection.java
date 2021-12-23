package concurrentHashMap;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentSkipListMap;
public class unmodificableMapByCollection
{
    public static void main(String args[]){

        Map<Integer,String> concurrentSkipListMap=new ConcurrentSkipListMap<Integer,String>();

        concurrentSkipListMap.put(1, "Harshit");
        concurrentSkipListMap.put(2, "Taha");
        concurrentSkipListMap.put(3, "Rahul");

        Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(concurrentSkipListMap);
        unmodifiableMap.put(41,"akanksha");
    }

}

