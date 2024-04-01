public class stack {
    public Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            Node next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void pop() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            int top = head.data;
            head = head.next;
            System.out.println("popped element " + top);

        }
    }

    public void peek() {
        if (head == null) {
            System.out.println("list is empty ");
        } else {
            System.out.println("biggestElement in the list" + head.data);
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
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.peek();
    }

}
