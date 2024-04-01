
public class stackes {
    
    
    int size = 100 ;
    int arr[] = new int[size];
    int top = -1 ;
    

    public void push(int data ){
        arr[top] = data ;
        top ++;
        System.out.println(data);
    }
    public void pop(){
        int data = arr[top];
        top--;
        System.out.println(data);
    }
    
    public int top(){
        return arr[top];
    }
    public int size (){
        return (top+1) ;
    }
    
    public static void main(String[] args) {
        stackes s = new stackes();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.top());
    }
    
}