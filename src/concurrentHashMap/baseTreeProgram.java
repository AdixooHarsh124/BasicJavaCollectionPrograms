package concurrentHashMap;

import java.util.Map;
import java.util.TreeMap;
public class baseTreeProgram
{
    public static void main(String args[])
    {

        Map<Integer,String> treeMap=new TreeMap<Integer,String>();

        treeMap.put(1, "dev");
        treeMap.put(2, "Ops");
        treeMap.put(3, "DevOps");

        System.out.println("the value "+treeMap.get(1));


        System.out.println("the containt key present or not : "+treeMap.containsKey(11));


        System.out.println("the containt value present or not "+treeMap.containsValue("ankit"));

        System.out.println("the romoved value"+treeMap.remove(11));


        System.out.println("the size in int is  "+treeMap.size());

    }
}
