package datastructure;


import java.util.HashMap;
import java.util.Map;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");
System.out.println(map);
System.out.println(map.get(1));
System.out.println(map.get(2));
System.out.println(map.get(3));
System.out.println(map.get(4));
System.out.println(map.get(5));
System.out.println(map.get(6));
System.out.println("collection view is:" +map.values()) ;
for(Map.Entry entry: map.entrySet()) {
        System.out.println(entry.getKey()+" " + entry.getValue());

}


    }

}
