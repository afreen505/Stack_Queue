package com.stackqueue;

public class MyStack {
    private MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.addToFront(myNode);
    }

    public void printStack() {
        // TODO Auto-generated method stub
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        // TODO Auto-generated method stub
        return myLinkedList.head;
    }

    public boolean popTillEmpty() {
        // TODO Auto-generated method stub
        if (myLinkedList.head == null) {
            return true;
        } else {
            while (myLinkedList.head != null) {
                INode tempNode = myLinkedList.head;
                if (myLinkedList.head.getNext() == null) {
                    myLinkedList.head = null;
                    return true;
                } else {
                    myLinkedList.head = tempNode.getNext();
                }
            }
            return false;
        }
    }

    public INode pop() {
        // TODO Auto-generated method stub
        return myLinkedList.tail;
    }
}