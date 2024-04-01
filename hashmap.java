import java.util.*;



public class hashmap {
    

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap <>();

        map.put("India", 120);
        map.put("us", 130);
        map.put("japan",1200);
        
        System.out.println(map);

        for(Map.Entry<String,Integer>e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        Set<String>keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " "+ map.get(key));
        }
    }
} 
  