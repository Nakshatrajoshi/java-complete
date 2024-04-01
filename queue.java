public class queue{
       static class Queue{
        static int arr[];
        static int size ;
        static int rear = -1 ;
        public Queue(int n){
            arr = new int[n];
            this.size = n ;
        }



        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if (rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] =data;
        }

        public static int remove(){
            if (!isEmpty()){
                System.out.println("Queue is full");
                return -1;
        }
        int front = arr[0];
        for (int i= 0; i<rear;i++){
            arr[i]=arr[i+1];

        }
        rear--;
        return front;
    }

    public static int peek (){
        if(!isEmpty()) {
            System.out.println("Queue is empty ");
            return -1;
        }
        return arr[0];
    }
       static void queueDisplay()   
    {   
        int i;   
        int front;
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
     
        // traverse front to rear and print elements   
        for (i = front; i < rear; i++) {   
            System.out.printf(" %d , ", queue[i]);   
        }   
        return;   
    }  
    
    

       }
       public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.queueDisplay();

       }

}