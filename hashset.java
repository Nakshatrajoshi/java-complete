import java.util.HashSet;
import java.util.Iterator;


public class hashset {
 public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>(); 

    // Insert
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(1);


    //size 
    System.out.println("size of set is : "+ set.size());
     
    // print all element
    System.out.println(set);
    
    // search

    if(set.contains(1)){
        System.out.println("Set contains 1 ");
        }
        
        if(!set.contains(6)){
            System.out.println("Set does not contain 6");
        }

         // Delete
         set.remove(1);
         if(!set.contains(1)){
             System.out.println("does not contains 1 - we deleted 1");
         }

         // Iterator

         Iterator it = set.iterator();
         while (it.hasNext()) {
            System.out.println(it.next());
         }

 }
    
}