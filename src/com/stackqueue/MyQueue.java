package com.stackqueue;

public class MyQueue {


    private MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode myNode) {
        myLinkedList.addToFront(myNode);
    }

    public INode front() {
        // TODO Auto-generated method stub
        return myLinkedList.tail;
    }

    public void printQueue() {
        // TODO Auto-generated method stub
        myLinkedList.printMyNodes();
    }

    public boolean deQueueFromQueue() {
        // TODO Auto-generated method stub
        if (myLinkedList.head == null) {
            return true;
        } else {
            if (myLinkedList.head.getNext() == null) {
                myLinkedList.head = null;
                return true;
            } else {
                while (myLinkedList.sizeOfLinkedList() != 0) {
                    INode tempNode = myLinkedList.tail;
                    INode previousNode = myLinkedList.head;
                    while (previousNode.getNext() != myLinkedList.tail) {
                        previousNode = previousNode.getNext();
                    }
                    myLinkedList.tail = previousNode;
                    tempNode = null;
                    if (myLinkedList.head == myLinkedList.tail) {
                        myLinkedList.head = null;
                        myLinkedList.tail = null;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

