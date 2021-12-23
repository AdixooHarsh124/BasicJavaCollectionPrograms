package concurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//here we are practicing for concurrentHashMap. In this program, i will us
// put,get,containsKey,containsValue,size, remove

public class concurrentHashMap {
    public static void main(String[] args) {
        //now, i make a reference variable of ConcurrentHashMap
        Map<Number,String> concurrentHashMap=new ConcurrentHashMap<>();

        System.out.println("please enter the key and values");

        //now i am putting a values in (key, value) form
        concurrentHashMap.put(1,"aaditya sir");
        concurrentHashMap.put(2, "sadiya ma'am");
        concurrentHashMap.put(3,"Taha");
        concurrentHashMap.put(4,"Rahul");
        concurrentHashMap.put(5,"Harshit");

        System.out.println("the key values are ===> "+concurrentHashMap);

        //now, i am getting values form key
        System.out.println("the value is ===>"+concurrentHashMap.get(1));

        //key is present or not
        System.out.println("this key is present ===>"+concurrentHashMap.containsKey(1));

        //value is present or not
        System.out.println("the value is present ===>"+concurrentHashMap.containsValue("Harshit"));

        //remove value form reference
        System.out.println(concurrentHashMap.remove(2));

        //the size of reference in int
        System.out.println(concurrentHashMap.size());

    }
}