class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class mergingTwoLL {

    public static void main(String[] args) {

        Node a = new Node(1);
        a.next = new Node(3);

        Node b = new Node(2);
        b.next = new Node(4);

        Node temp = a;

        while(temp.next != null) {

            temp = temp.next;
        }

        temp.next = b;

        temp = a;

        while(temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}