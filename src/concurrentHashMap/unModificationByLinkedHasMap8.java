package concurrentHashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collections;
public class unModificationByLinkedHasMap8 {
    public static void main(String args[]){

        Map<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();

        linkedHashMap.put(1, "Node");
        linkedHashMap.put(2, "Express");
        linkedHashMap.put(3, "MongoDd");
        linkedHashMap.put(4,"Angular");
        Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.put(5,"React");
    }
}
