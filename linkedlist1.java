
public class linkedlist1 {
    public Node head = null;
    // public Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } 
        else {
            newNode.next = head;
            head = newNode;

        }
    }

    int listlenght(Node head) {
        int size = 0;
        Node temp = head ;
        if(temp == null){
            System.out.println("no data is there ");
        }
        else{
            
        while (temp != null) {
            temp= temp.next;
            size++;
        }
        
    }
        return size;

    }

    public void InsertatGivenpostion(int data, int p) {
        Node newNode = new Node(data);
        int size = listlenght(head);
        if (p < 1 || p > size) {
            System.out.println("List is empty or Invalild position");
        } else if (p == 1) {

            newNode.next = head;
            head = newNode;
        } else if (p == p + 1) {

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newNode;
        } else {

            Node temp = head;
            int f = 1;
            while (f < p - 1) {
                temp = temp.next;
                f++;
            }
            Node m = temp.next;
            temp.next = newNode;
            newNode.next = m;

        }
    }


    public void insertatend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("list is empty ");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteheadNode() {

        if (head == null) {
            System.out.println("list is empty ");
        } else{

            head = head.next;
            System.out.println(head.data + " new head");
        } 
    }

    public void deleteEndnode() {

        Node previous = head;
        Node tailNode = head;
        tailNode = tailNode.next;
        while (tailNode.next != null) {
            tailNode = tailNode.next;
            previous = previous.next;
        }
        previous.next = null;
        tailNode = null;
    }

    public void deleteNodeatGivenposition(int p) {
        if (head == null) {
            System.out.println("list is empty ");
        } else if (p == 1) {
            head = head.next;
        } else {
            Node temp = head;
            int i = 1;
            while (i < p - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }

    }

    public void SearchNode(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("node is present in the list ");
            }
            temp = temp.next;

        }
    }

    public void display() {

        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();

    }

    

    // public static void main(String[] args) {
    //     linkedlist1 llist = new linkedlist1();
    //     llist.insertAtBegin(1);
    //     // llist.insertAtBegin(2);
    //     // llist.insertAtBegin(3);
    //     // llist.insertatend(5);
    //     // llist.insertatend(6);
    //     // llist.InsertatGivenpostion(4, 3);
    //     // llist.display();
    //     // System.out.println("All the value has inserted at the begining and at the
    //     // given position and at end also ");
    //     // System.out.println("last node has deleted ");
    //     // llist.deleteEndnode();
    //     // llist.display();
    //     // System.out.println("Node is deleted");
    //     // llist.deleteNodeatGivenposition(3);

    //     // llist.listlenght();
    //     llist.display();
    //     // llist.SearchNode(2);

    // }
}
