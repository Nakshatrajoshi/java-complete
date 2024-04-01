public class CLLlinkedlist {
    public Node head = null;
    class Node {
        int data ;
        Node next ;
        public Node(int data ){
            this.data=data;
            this.next=null;
        }
    }
    public void InsertAtBegin(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode ;
            head.next = head;
        }
        else {
            Node temp = head ;
            while ( temp != head ){
                temp = temp.next ;
            }
            newNode.next = head ;
            temp.next = newNode ;
            head = newNode ;
        }
    }


public void InsertAtEnd(int data){
    Node newNode = new Node(data);
    if (head == null){
        head = newNode;
        newNode.next=head ;
    }
    else {
        Node temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        temp.next =newNode ;
        newNode.next  = head ;
    }
}
int listlenght (Node head){
    int count =0;
    while (head != null){
        ++count;
        head  = head .next;
    }
    return count ;
}


public void InsertatGivenpostion(int data,int p){
    Node newNode = new Node(data);
    if (head == null){
        System.out.println("list is empty ");
    }
    else if (p == 1){
        InsertAtBegin(data);
    }
    else if ( ){
    
}

public void display() {  
    Node current = head;  
    if(head == null) {  
        System.out.println("List is empty");  
    }  
    else {  
        System.out.println("Nodes of the circular linked list: ");  
         do{  
            
            System.out.print(" "+ current.data);  
            current = current.next;  
        }while(current != head);  
        System.out.println();  
    }  
}  


public static void main(String[] args) {
    
    CLLlinkedlist Cll = new CLLlinkedlist();
    Cll.InsertAtBegin(3);
    Cll.InsertAtEnd(4);
    Cll.display();
}
}
