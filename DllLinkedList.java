public class DllLinkedList {
    public Node head = null;

    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public void InsertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.previous = null;
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("list is empty ");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
        }

    }

    int listlenght(Node head) {
        int size = 0;
        while (head != null) {
            ++size;
            head = head.next;
        }
        return size;
    }

    public void InsertatGivenpostion(int data, int p) {
        Node newNode = new Node(data);
        int size = listlenght(head);
        if (p < 1 || p > size) {
            System.out.println("Invalid input ");
        } else if (p == 1) {
            newNode.previous = null;
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        } else if (p == p + 1) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
        } else {

            Node temp = head;
            int f = 1;
            while (f < p - 1) {
                temp = temp.next;
                f++;
            }
            Node current = temp.next;
            newNode.previous = temp;
            newNode.next = current;
            current.previous = newNode;
            temp.next = newNode;
        }

    }
    


    // public void DeleteNodeAtBegin(int data) {
    //     if (head == null) {
    //         System.out.println("List is empty ");
    //     } else {
    //         head = head.next;

    //     }
    // }

    // public void DeleteNodeAtEnd(int data) {
    //     if (head == null) {
    //         System.out.println("list is empty ");
    //     } else {
    //         Node previous = head;
    //         Node tailNode = head;
    //         tailNode = tailNode.next;
    //         while (tailNode.next != null) {
    //             tailNode = tailNode.next;
    //             previous = previous.next;
    //         }
    //         previous.next = null;
    //         tailNode = null;
    //     }
    // }
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

    public void display() {

        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {

        DllLinkedList dll = new DllLinkedList();
        dll.InsertAtBegin(0);
        dll.InsertatGivenpostion(1, 1);
        dll.InsertatGivenpostion(2, 2);
        dll.InsertatGivenpostion(3, 3);
        dll.InsertAtEnd(4);
        dll.deleteNodeatGivenposition(1);
        dll.display();
    }
}
