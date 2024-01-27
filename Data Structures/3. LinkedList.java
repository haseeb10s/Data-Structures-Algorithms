//LinkedList
import java.util.*;
class LL{
    Node head;
    private int size;
    public class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //addFirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //addLast
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        //Traverse
        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next=newNode;
    }
    //print
    public void printList(){
        if (head==null){
            System.out.println("List is Empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }
    //deleteFirst
    public void deleteFirst(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    //deleteLast
    public void deleteLast(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        Node lastNode = head;
        Node secondLast = head;
        while (lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }
    public static void main(String [] args){
        LL list = new LL();
        list.addLast("Haseeb");
        list.addLast("Majid");
        list.printList();
        System.out.println("------");
        list.addFirst("Abdul");
        list.printList();
        System.out.println("------");
        list.deleteFirst();
        list.printList();
        System.out.println("------");
        list.deleteLast();
        list.printList();
        System.out.println("------");
        System.out.println("Size of a list is: " + list.getSize());
    }
}

