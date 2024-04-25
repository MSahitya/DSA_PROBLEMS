package org.example.CustomLinkedList;

public class CLLMain {
    public static void main(String[] args) {
        CircularLL cli=new CircularLL();
        cli.insert(1);
        cli.insert(2);
        cli.insert(3);
        cli.insert(4);
        cli.display();
        cli.delete(3);
        cli.display();
    }
}
