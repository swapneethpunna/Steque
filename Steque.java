/*
 *  File: Steque.java
 *  Author: 
 *  Date: 18th Nov, 2021
 *  ---------------------------------------
 *  Steque is stack-ended queue data structure which supports
 *  stack operations: pop and push, along with queue enqueue 
 *  operation.
 *  
 *  Salient features:
 *  1. Operations like push, pop, enqueue are supported.
 *  2. NullPointerException is thrown when null element is inserted.
 *  3. UnsupportedOperationException is thrown when using remove() method.
 *  4. The data structure is iterable and is implemented for generic type.
 *  
 */

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * 
 * Steque is a stack-ended data structure which 
 * supports stack operations as well as queue's 
 * enqueue operation.
 * 
 * @author 
 * @version 1.0
 *
 */
public class Steque<Item> implements Iterable<Item> {
     private Node first,last;
     private int n;
     private class Node{
        Item item;
        Node next;
     }
    /**
     * constructs a steque object.
     */
    public Steque() {
        n=0;
        first=last=null;
    }
    
    
    /**
     * inserts an item in the steque in queue fashion.
     * @param item Item to be inserted.
     */
     //Time Complexity:O(1), Space Complexity:O(N)
    public void enqueue(Item item) {
    if(item==null)
        throw new IllegalArgumentException();
    Node oldlast=last;
    last=new Node();
    last.item=item;
    last.next=null;
    if(first==null)
        first=last;
    else
        oldlast.next=last;
    n++;
    }
    
    
    /**
     * inserts an item in the steque in stack fashion.
     * @param item Item to be inserted.
     */
    //Time Complexity:O(1), Space Complexity:O(N)
    public void push(Item item) {
    if(item==null)
        throw new IllegalArgumentException();
    Node oldfirst=first;
    first=new Node();
    first.item=item;
    first.next=oldfirst;
    if(last==null)
        last=first;
    n++;
}


    }
    
    /**
     * pops a least recent item in steque.
     * @return Item object from steque.
     */
    //Time Complexity:O(1), Space Complexity:O(N)
    public Item pop() {
        if(isEmpty())
            throw new NoSuchElementException();
        Item item=first.item;
        first=first.next;
        n--;
        return item;
    }
    
    /**
     * checks to see if steque is empty.
     * @return true if steque is empty, false otherwise.
     */
    public boolean isEmpty() {

    }
    
    /**
     * return the number of elements currently in the steque.
     * @return size as integer.
     */
    public int size() {

    }
    
    /**
     * returns an iterator over the elements 
     * stored in steque.
     * 
     */
    public Iterator<Item> iterator() {

    }
}
