import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode {

   
    private static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
       
        List<Integer> mergedList = new ArrayList<>();

        int h1= 0;
        int h2= 0;
        while (h1 < list1.size() && h2 < list2.size()) {
            if (list1.get(h1) < list2.get(h2)) {
                mergedList.add(list1.get(h1));
                h1++;
            } else {
                mergedList.add(list2.get(h2));
                h2++;
            }
        }

      
        while (h1 < list1.size()) {
            mergedList.add(list1.get(h1));
            h1++;
        }

        
        while (h2 < list2.size()) {
            mergedList.add(list2.get(h2));
            h2++;
        }

        return mergedList;
    }

     public static void main(String[] args) {
      
        List<Integer> list1 = Arrays.asList(0,1,3,5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);

  
        List<Integer> mergedList = mergeTwoLists(list1, list2);

    
        System.out.println(mergedList);
    }

}