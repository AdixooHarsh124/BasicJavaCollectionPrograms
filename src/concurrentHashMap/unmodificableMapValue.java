package concurrentHashMap;

import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;
public class unmodificableMapValue {
    public static void main(String args[])
    {
        Map<Integer,String> treeMap=new TreeMap<Integer,String>();
        treeMap.put(1,"c");
        treeMap.put(2,"c++");
        treeMap.put(3,"java");

        Map<Integer,String> unModificableMap=Collections.unmodifiableMap(treeMap);
        System.out.println(unModificableMap);
        //now any change will give an error(UnsupportedOperarion)
//        try {
//            unModificableMap.put(4, "python");
//        }catch(UnsupportedOperationException e)
//        {
//            e.printStackTrace();
//        }
    }
}
