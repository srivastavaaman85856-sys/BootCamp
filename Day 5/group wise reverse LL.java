class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class groupWiseReverseLL {

    static Node reverse(Node head, int k) {

        Node prev = null;
        Node current = head;
        Node next = null;

        int count = 0;

        while(current != null && count < k) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

            count++;
        }

        if(next != null) {

            head.next = reverse(next, k);
        }

        return prev;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = reverse(head, 2);

        Node temp = head;

        while(temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}