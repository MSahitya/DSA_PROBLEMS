package org.example.CustomLinkedList;

public class CircularLL {


    private Node head;
    private Node tail;

    public CircularLL(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    public CircularLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node=new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next= head;
        tail = node;

    }
    public void display(){

        Node node=head;
        if( head != null){
            do{
                System.out.print(node.val+"<->");
                node = node.next;
            }while( node != head);
            System.out.print( head.val+"\n");
        }
    }
    public void delete(int val){
        Node temp=head;
        if( temp == null)
            return;
     if(temp.val == val){
         head = head.next;
         tail = head;
     }
     do{
         Node n=temp.next;
         if(n.val == val){
             temp.next=n.next;
             break;
         }
         temp = temp.next;
     }while(temp != head);


    }

    private class Node{
        private Node next;
        private final int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
