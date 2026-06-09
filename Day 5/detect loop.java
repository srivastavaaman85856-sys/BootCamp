class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class detectLoop {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Creating loop
        head.next.next.next = head;

        Node slow = head;
        Node fast = head;

        boolean loop = false;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {

                loop = true;
                break;
            }
        }

        if(loop) {

            System.out.println("Loop Detected");
        }
        else {

            System.out.println("No Loop");
        }
    }
}