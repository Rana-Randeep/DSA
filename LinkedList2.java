import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1(int val){
        data=val;
        next=null;
    }
}

public class LinkedList2 {
   public static  Node1 head=new Node1(1);
    public static  void insertAtBeg(int a,Node1 temp){
        Node1 curr=temp;
        Node1 newnode=new Node1(a);
        newnode.next=curr;
        head=newnode;
        System.out.println("element inserted");
    }

    public static void insertAtEnd(int a,Node1 temp){
        Node1 curr=temp;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new Node1(a);
        System.out.println("element inserted");
    }

    public static void insertAtSpecific(int pos,int a,Node1 temp){
        Node1 newnode=new Node1(a);
        Node1 curr=temp;
        for(int i=0;i<pos-2;i++){
            curr=curr.next;
        }
        newnode.next=curr.next;
        curr.next=newnode;
        System.out.println("element inserted");
    }

    public static void printList(Node1 temp){
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print(" -> ");
            }
            temp=temp.next;
        }
        System.out.println();
    }

    public static void deleteAtBeg(){
        head=head.next;
        System.out.println("element deleted");
    }

    public static void deleteAtEnd(Node1 temp){
        Node1 curr=temp;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        System.out.println("element deleted");
    }

    public static void deleteAtSpecific(int pos,Node1 temp){
        Node1 curr=temp;
        for(int i=0;i<pos-2;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        System.out.println("element deleted");
    }

    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        head.next=new Node1(2);
        head.next.next=new Node1(3);
        System.out.println("Below is the Linked List ");
        printList(head);

        while(true) {
            System.out.println("Which operation do you want to perform on Linked List");
            System.out.println("Press 1 for insertion operation");
            System.out.println("Press 2 for deletion operation");
            System.out.println("Press 3 to display your Linked List");
            int option = we.nextInt();

            if (option == 1) {
                System.out.println("Please select one");
                System.out.println("Press 4 for insertion at beginning");
                System.out.println("Press 5 for insertion at end");
                System.out.println("Press 6 for insertion at specific position");
                int opt = we.nextInt();
                if (opt == 4) {
                    System.out.println("Enter value you want to insert");
                    int a = we.nextInt();
                    insertAtBeg(a, head);
                }
                else if (opt == 5) {
                    System.out.println("Enter value you want to insert");
                    int a = we.nextInt();
                    insertAtEnd(a, head);
                }
                else if(opt==6){
                    System.out.println("Enter the position");
                    int pos = we.nextInt();
                    System.out.println("Enter value you want to insert");
                    int a = we.nextInt();
                    insertAtSpecific(pos, a, head);
                }
                else{
                    System.out.println("PLEASE ENTER VALID NUMBER");
                }

            } else if (option == 2) {
                System.out.println("Please select one");
                System.out.println("Press 7 for deletion at beginning");
                System.out.println("Press 8 for deletion at end");
                System.out.println("Press 9 for deletion at specific position");
                int opt = we.nextInt();
                if (opt == 7) {
                    deleteAtBeg();
                }
                else if (opt == 8) {
                    deleteAtEnd(head);
                }
                else if(opt==9) {
                    System.out.println("Enter the position");
                    int pos = we.nextInt();
                    deleteAtSpecific(pos, head);
                }
                else{
                    System.out.println("PLEASE ENTER VALID NUMBERS");
                }
            }
            else if(option==3) {
                printList(head);
            }
            else{
                System.out.println("PLEASE ENTER VALID NUMBERS");
            }
        }
    }
}
