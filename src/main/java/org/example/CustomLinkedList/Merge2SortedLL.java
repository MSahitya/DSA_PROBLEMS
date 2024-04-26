package org.example.CustomLinkedList;

public class Merge2SortedLL {
    public static void main(String[] args) {
       LL li=new LL();
       li.insertFirst(1);
        li.insertEnd(1);
        li.insertEnd(2);li.insertEnd(3);
        li.insertEnd(4);


        LL li1=new LL();
        li1.insertFirst(1);
        li1.insertEnd(2);
        li1.insertEnd(2);li1.insertEnd(3);
        li1.insertEnd(5);
        li1.insertEnd(6);

        LL ans=li.merge(li,li1);
        ans.display();











    }
}
