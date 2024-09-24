     // program -> to get Nth node from both starting and  end; -> to delete a linked list

import java.util.Scanner;
class Node3{
    int data;
    Node3 next;
    Node3(int val) {
        data=val;
    next=null;
    }
}

public class LinkedList4 {

    static void printList(Node3 temp){
        if(temp==null)
            System.out.println("Linked List is empty");

        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print(" -> ");
            }
            temp=temp.next;
        }
        System.out.println();
    }

    static int getNthNode(Node3 temp,int x) {
        if (x > 5) {   // 5 is length of linked list
            System.out.println("There are only 5 values inside Linked List");
        } else {
            for (int i = 1; i < x; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
        return 0;
    }

   static int NthNodeFromEnd(Node3 temp ,int x){
        if(x>5){
            System.out.println("There are only 5 values inside Linked List");
        }
        else {
            int y = 5 - x + 1;
            for(int i=1;i<y;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        return 0;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
Node3 head=new Node3(18);;
head.next=new Node3(36);
head.next.next=new Node3(54);
head.next.next.next=new Node3(72);
head.next.next.next.next=new Node3(90);

System.out.println("Given Linked List");
printList(head);

System.out.println("Which position you want to access from Linked List");
int pos=scan.nextInt();
getNthNode(head,pos);

System.out.println("Which position you want to access from the end of Linked List");
int a=scan.nextInt();
NthNodeFromEnd(head,a);

System.out.println("Enter 1 to delete the Linked List");
int i=scan.nextInt();
if(i==1)
    head = null;

printList(head);
    }
}
