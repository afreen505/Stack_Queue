package com.stackqueue;

import junit.framework.Assert;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void popFromStack() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();

        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);

        INode topOfStack = myStack.pop();
        Assert.assertEquals(myFirstNode, topOfStack);
    }

    @Test
    public void popFromStackTillEmpty() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();

        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        System.out.println("List before popping is : ");
        myStack.printStack();

        boolean result = myStack.popTillEmpty();
        System.out.println("List after popping till empty is : ");
        myStack.printStack();
        Assert.assertTrue(result);
    }
}