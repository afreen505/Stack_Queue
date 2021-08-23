package com.stackqueue;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class MyQueueTest {

    @Test
    public void given3NumbersWhenAddedToQueueShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);

//		myQueue.printQueue();

        INode peakOfQueue = myQueue.front();
        Assert.assertEquals(myFirstNode, peakOfQueue);

    }

    @Test
    public void dequeueFromQueueTillEmpty() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        System.out.println("Before dequeueing : ");
        myQueue.printQueue();

        boolean result = myQueue.deQueueFromQueue();
        System.out.println("After dequeueing : ");
        myQueue.printQueue();
        Assert.assertTrue(result);
    }
}


