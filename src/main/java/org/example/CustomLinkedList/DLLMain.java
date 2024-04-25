package org.example.CustomLinkedList;

public class DLLMain {
    public static void main(String[] args) {
        DLL dli=new DLL();
         dli.insertFirst(1);
        dli.insertFirst(2);
        dli.insertFirst(3);
        dli.insertFirst(4);
        dli.insertFirst(5);
        dli.display();
       System.out.print("Reverse DLL="); dli.displayReverse();
        dli.insertEnd(29);
        dli.insert(8,3);
        dli.display();
       // dli.displayReverse();
    }
}
