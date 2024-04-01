import java.util.ArrayList;
import java.util.List;

public class stacks{
List <Integer> stacks;

public stacks(){
    stacks = new ArrayList<>();
}



public void push(int data){
    stacks.add(data);
    System.out.println(data);
}

public void pop(){
    if (!stacks.isEmpty()){
        int pop =stacks.get(stacks.size()-1);
        stacks.remove(stacks.size()-1);
        System.out.println("Popped element is: "+pop );
    }
    else {
        System.out.println("Stack Underflow");
    }
}
public boolean isEmpty() {
    if(stacks.isEmpty()){
        return true ;
    }
    else {
        return false;
    }
}
    public int peek(){
        return stacks.get(stacks.size()-1);
    }

   
   public static void main(String[] args) {
    stacks  s = new stacks();
    s.push(1);
    s.push(2);
    s.push(3);
    System.out.println(s.isEmpty());
    System.out.println(s.peek());
    
}
}

