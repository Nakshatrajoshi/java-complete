

/**
 * liste
 */
public class liste {
class Node {
    int data;
    Node next;

public Node(int data){
    this.data = data;
    this.next = null;
}
}
public Node head = null;
public Node tail = null;

public void addNode(int data){
    Node newNode = new Node(data);
  Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

    }




public void tailNode(int data ){
  Node newNode = new Node(data);
 
    Node temp = newNode;
        
    while(temp.next != null)
    temp = temp.next;
    temp.next = newNode;
    System.out.print(newNode.data + " ");
}
public int calcSize(Node node){
    int size = 0;
    while(node!=null){
        node = node.next;
        size++;
    }
    return size;
}


public void insertMid(int n,int data)
{
    int size = calcSize(head);
    if(n < 1 || n > size)
    {
        System.out.println("Can't insert");

    }
    else
    {
        Node newNode = new Node(data);
        Node temp = head;

        while(--n > 0)
            temp=temp.next;

        newNode.next= temp.next;
        temp.next = newNode;
    }
}

public void  deleteNode(int value )

{
        Node temp = head ;
        Node previous = null;
        if (temp == null){
            System.out.println("List is empty");
            return;
        }
        if(temp.next==null)
        {
            head = null;
            System.out.println("Deleted: " + value);
            return;
        }
        if(temp.data==value)
        {
            head = temp.next; 
            System.out.println("Deleted: " + value);
            return;
        }

        while (temp != null && temp.data != value)
        {
            
            previous = temp;
            temp = temp.next;
        }

      
        if(temp==null)
        {
            System.out.println("Value not found");
            return;
        }

        previous.next = temp.next;
        System.out.println("Deleted: " + value);
    }




public void display (){
    Node node = head;
    while(node!=null)
    {
        System.out.print(node.data + " ");
        node = node.next;
    }
    System.out.println();
    
           
            
        }
        public static void main(String[] args) {

            liste ll = new liste();

            ll.addNode(5);
            ll.addNode(6);
            ll.addNode(8);
            ll.addNode(9);
            ll.display();
            ll.deleteNode(9);
            ll.display();
            

           
            
        }
    }


