public class queue2 {
    public Node head = null;
    class Node {
        int data;
        Node next ;

       public Node (int data){
        this.data = data ;
        this.next = null ;
       }
    }

    public void InsertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ;
        }
         else{
            
            Node temp  = head ;
            while(temp !=null && temp.next!=null){
                temp=temp.next ;
            }
            temp.next = newNode ;
         }


        }
        public void DeleteFromHead(){
            System.out.println("Deleted element is : "+head.data );
            if(head==null) return ;
            head = head.next ;
        }

        public void display(){
            Node node = head;
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            queue2 q1 =new queue2() ;
           q1.InsertNode(1);
           q1.InsertNode(2);
           q1.display();
           q1.DeleteFromHead();
           q1.display();

        }
    }

