import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next=null;
    }
};
 public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
           
        }
        int k = sc.nextInt();
        if(k==1){
            System.out.println("list becomes empty");
            return;
        }
        Node temp = head;
        int count = 1;
        while(temp!=null && temp.next!=null){
            if((count+1)%k==0){
                temp.next=temp.next.next;
            }
            else{
                temp = temp.next;
            }
            count++;
        }
        temp = head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}