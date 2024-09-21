class Node{
    int  data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}

public class LinkedList {
    public static void printList(Node temp){
        while(temp!=null){
            System.out.print(temp.data+" ");
            if(temp.next!=null){
                System.out.print(" -> ");
            }
            temp=temp.next;
        }
    }

    public static void main(String args[]){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        printList(head);
    }
}
