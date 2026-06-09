class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class countoccurrenceinLL {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        int key = 1;
        int count = 0;

        Node temp = head;

        while(temp != null) {

            if(temp.data == key) {

                count++;
            }

            temp = temp.next;
        }

        System.out.println(count);
    }
}