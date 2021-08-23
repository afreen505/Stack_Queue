package com.stackqueue;


import java.util.function.Predicate;

public class MyLinkedList {
    public INode head;
    public INode tail;

    MyLinkedList() {
        this.head = null;\;
        this.tail = null;
    }

    public void addToFront(INode newNode) {
        // TODO Auto-generated method stub
        if (tail == null) {
            this.tail = newNode;
        }
        if (head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void addToBack(INode newNode) {
        // TODO Auto-generated method stub
        if (tail == null) {
            this.tail = newNode;
        }
        if (head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.tail;
            this.tail = newNode;
            tempNode.setNext(tail);
        }
    }

    public void insertInBetweenTwoNodes(INode headNode, INode newNode) {
        INode tempNode = headNode.getNext();
        headNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode deleteFirstElementInLinkedList() {
        INode DeletedFirstNode = head;
        INode tempNode = head.getNext();
        head = tempNode;
        return DeletedFirstNode;
    }

    public INode deleteLastElementInLinkedList() {
        INode DeletedLastNode = tail;
        INode tempNode = head.getNext();
        tail = tempNode;
        return DeletedLastNode;
    }

    public boolean SearchAnElementInALinkedList(Integer elementValue) {
        // TODO Auto-generated method stub
        INode pointerNode = head;
        while (pointerNode != tail) {
            if (pointerNode.getKey() == elementValue) {
                System.out.println("Element found");
                return true;
            }
            pointerNode = pointerNode.getNext();
        }
        if (pointerNode.getKey() == elementValue) {
            System.out.println("Element found");
            return true;
        }
        System.out.println("Element not found");
        return false;
    }

    public boolean InsertingAnElementAfterAnElementInALinkedList(Integer specifiedElement, INode newNode) {
        // TODO Auto-generated method stub
        if (SearchAnElementInALinkedList(specifiedElement)) {
            INode pointerNode = head;
            while (pointerNode != tail) {
                if (pointerNode.getKey() == specifiedElement) {
                    newNode.setNext(pointerNode.getNext());
                    pointerNode.setNext(newNode);
                    return true;
                } else {
                    pointerNode = pointerNode.getNext();
                    continue;
                }
            }
        } else {
            return false;
        }
        return false;
    }

    public boolean DeletingAnElementInALinkedList(Integer specifiedElement) {
        // TODO Auto-generated method stub
        if (SearchAnElementInALinkedList(specifiedElement)) {
            INode pointerNode = head;
            while (pointerNode != tail) {
                if (pointerNode.getNext().getKey() == specifiedElement) {
                    INode tempNode = pointerNode.getNext();
                    pointerNode.setNext(tempNode.getNext());
                    System.out.println("Deleted Element is : " + tempNode.getKey());
                    return true;
                } else {
                    pointerNode = pointerNode.getNext();
                    continue;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void SortedAdding(MyNode<Integer> currentNode) {
        // TODO Auto-generated method stub
        if (tail == null) {
            this.tail = currentNode;
        }
        if (head == null) {
            this.head = currentNode;
        } else {
            INode tempNode = head;
            INode previousNode = head;
            if (currentNode.getKey().compareTo((Integer) tempNode.getKey()) > 0) {
                while (currentNode.getKey().compareTo((Integer) tempNode.getKey()) > 0 && tempNode.getNext() != null) {
                    previousNode = tempNode;
                    tempNode = tempNode.getNext();
                }
                if (currentNode.getKey().compareTo((Integer) tempNode.getKey()) < 0) {
                    INode frontNode = tempNode;
                    currentNode.setNext(frontNode);
                    previousNode.setNext(currentNode);
                } else {
                    tempNode.setNext(currentNode);
                    tail = currentNode;
                }
            } else {
                currentNode.setNext(head);
                head = currentNode;
            }
        }
    }

    public int sizeOfLinkedList() {
        int count = 0;
        INode pointerNode = head;
        while (pointerNode != tail) {
            count++;
            pointerNode = pointerNode.getNext();
        }
        count++;
        System.out.println("Size of linked list is : " + count);
        return count;
    }

    public void printMyNodes() {
        INode tempNode = head;
        if (tempNode == null) {
            System.out.println("Empty list");
        } else {
            while (tempNode != tail) {
                System.out.print(tempNode.getKey());
                if (!tempNode.equals(tail))
                    System.out.print(" -> ");
                tempNode = tempNode.getNext();
            }
            System.out.print(tempNode.getKey());
            System.out.println();
        }
    }
}

