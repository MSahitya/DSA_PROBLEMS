package org.example.CustomLinkedList;

public class LL {
    private Node head;
    private  Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail=head;
               }

        size++;
    }
    public void insertEnd(int val){

        if(tail == null)
            insertFirst(val);
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){
       if(index == 0){
           insertFirst(val);
           return;
       }
       if(index == size){
           insertEnd(val);
           return;
       }
       Node temp=head;
      for(int i = 1; i < index; i++){
          temp=temp.next;
       }
        Node node=new Node(val,temp.next);
        temp.next=node;
         size++;

    }
    public int deleteFirst(){
        int val=head.val;
        head = head.next;
        if(head == null){
            tail=null;
        }
        size --;
        return val;
    }
public int deleteLast(){
        if(size < 1){
            return deleteFirst();
        }
        Node secondLast=get(size -2);
        int val = secondLast.val;
        tail = secondLast;
        tail.next = null;
        return val;

}

public int delete( int index ){

        if(index == 0)
            return  deleteFirst();
        if(index == size-1)
            return deleteLast();

        Node prev=get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;


    return val;

}

public Node find(int value){
        Node temp=head;
        while( temp != null){
            if(temp.val == value){
                return temp;
            }
            temp = temp.next;
        }

        return null;
}
public Node get(int index){
        Node node = head;
        for (int i = 0; i < index ; i++ ){
            node = node.next;
        }
        return node;
}
public void display(){
        Node temp=head;
        while( temp !=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
    System.out.print(" END \n");
}


    private class Node{
        private Node next;
        private int val;

        public Node(int val) {
            this.val = val;
        }

        private Node node;

        public Node(int val, Node node) {
            this.val = val;
            this.next = node;
        }
    }
}
