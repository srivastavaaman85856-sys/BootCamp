class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class additionOfTwoLL {

    public static void main(String[] args) {

        Node a = new Node(2);
        a.next = new Node(3);

        Node b = new Node(4);
        b.next = new Node(5);

        Node t1 = a;
        Node t2 = b;

        while(t1 != null && t2 != null) {

            System.out.print(t1.data + t2.data + " ");

            t1 = t1.next;
            t2 = t2.next;
        }
    }
}