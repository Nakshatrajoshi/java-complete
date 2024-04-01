import java.util.*;

public class hashmap1 {
    class HashMap<k,V>{
        class Node {
            k key ;
            V value ;
        
        public Node(k key ,V value ){
            this.key = key;
            this.value = value ;

        }
    }
    private int n ;
    private int N;
    private LinkedList<Node> buckets[];

    public HashMap(){
        this.N = 4 ;
        this.buckets = new LinkedList[4];
        for(int i=0; i<4; i++){
            this.buckets[i]=new LinkedList<>();
        }
    }
    }
    
}
