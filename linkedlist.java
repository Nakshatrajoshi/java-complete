import java.util.*;

public class linkedlist {
public static void main(String[] args) {

    LinkedList<Integer> al=new LinkedList<Integer>();  
    al.add(1);
    al.add(2);
    al.addFirst(0);
    al.addLast(5);
    al.add(4, 3);
    al.add(5,4);
    System.out.println("Linked List is: "+al );
    al.sort(Comparator.naturalOrder());
    System.out.println(al);
    
}
    
}