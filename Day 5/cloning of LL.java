class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class cloningOfLL {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node newHead = null;
        Node tail = null;

        Node temp = head;

        while(temp != null) {

            Node newNode = new Node(temp.data);

            if(newHead == null) {

                newHead = newNode;
                tail = newNode;
            }
            else {

                tail.next = newNode;
                tail = newNode;
            }

            temp = temp.next;
        }

        temp = newHead;

        while(temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}