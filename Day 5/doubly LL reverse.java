class Node {

    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
    }
}

class doublyLLReverse {

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        Node temp = null;
        Node current = head;

        while(current != null) {

            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if(temp != null) {

            head = temp.prev;
        }

        current = head;

        while(current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}