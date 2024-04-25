package org.example.CustomLinkedList;

public class LLRecrusiveInsertion {
    public static void main(String[] args) {
        Node head=null;
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        head=n1;
        n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
        LinkedListCustomInput.recursiveDisplay(head);
        //Insert 25 at index 2{index starts with 0} insert using Recursion
        System.out.println("After Recursive Insertion");
        LinkedListCustomInput.recursiveDisplay(insertValUsingRec(2,25,head));

    }

    private static Node insertValUsingRec(int index, int val, Node node) {
        if(index == 0){
            Node temp=new Node(val);
            temp.next=node;
            return  temp;
        }

        System.out.println("Current="+node.data+"\t index="+index);
        node.next=insertValUsingRec(--index,val,node.next);
        return node;

    }

}