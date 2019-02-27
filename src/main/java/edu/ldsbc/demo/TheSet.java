package edu.ldsbc.demo;


import java.util.*;

public class TheSet {
    public static void main(String[] args) {
        Set setA = new HashSet();
        String element1 = "element 1";
        setA.add(element1);
        System.out.println(setA);
        Map<String,String> mapA =  new HashMap<String,String>();
        mapA.put("key1", element1);
        mapA.put("key2", "element2");
        System.out.println(mapA);
//        mapA.remove("key2");
        System.out.println(mapA);
//        mapA.clear();
        System.out.println(mapA.get("key1"));
        System.out.println(mapA.keySet());
        for(String value : mapA.values()) {
            System.out.println(value);
        }
        List listA = new ArrayList();
        int one = 1;
        listA.add(one);
        System.out.println(listA.toString());
    }

}
