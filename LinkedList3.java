   //REVERSE OPERATION ON LL AND SEARCH OPERATION ON LL

import java.util.Scanner;
class Node2{
    int data;
    Node2 next;
    Node2(int val){
        data=val;
        next=null;
    }
}

public class LinkedList3 {

    static void printList(Node2 head){
        while(head!=null){
            System.out.print(head.data);
            if(head.next!=null){
                System.out.print(" -> ");
            }
            head=head.next;
        }
        System.out.println();
    }

    static Node2 reverseList(Node2 head){
        Node2 curr=head;
        Node2 prev=null;
        Node2 next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    static boolean searchList(int a,Node2 temp){
        Node2 curr=temp;
        while(curr!=null){
          if(curr.data==a)
              return true;
          curr=curr.next;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        Node2 head = new Node2(10);
        head.next = new Node2(20);
        head.next.next = new Node2(30);
        head.next.next.next=new Node2(40);

        System.out.println("Given Linked List");
        printList(head);

        System.out.println("Reverse of given Linked List");
        head= reverseList(head);
        printList(head);

        System.out.println("Enter value you want to search in this given Linked List");
        int key=scan.nextInt();

        if(searchList( key,head))
            System.out.println("YES ,PRESENT");
        else
            System.out.println("NOT PRESENT");
    }
}
