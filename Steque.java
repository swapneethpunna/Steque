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
    private Item[] a;
    private int n;
    private int first;
    private static int incapacity=10;

    /**
     * constructs a steque object.
     */
    public Steque() {
        a=(Item[]) new Object[incapacity];
        n=0;
        first=0;

    }
    
    
    /**
     * inserts an item in the steque in queue fashion.
     * @param item Item to be inserted.
     */
    public void enqueue(Item item) {
        if(item==null)
        throw new IllegalArgumentException();
    if(n>=a.length)
        resize(2*a.length);
        for(int i=a.length-1;i>0;i--)
            a[i]=a[i-1];
            a[0]=item;
            n++;
}
private void resize(int capacity){
    Item temp[]=(Item[]) new Object[capacity];
    for(int k=0;k<a.length;k++){
        temp[k]=a[k];
    }
    a=temp;
}


    
    
    /**
     * inserts an item in the steque in stack fashion.
     * @param item Item to be inserted.
     */
    public void push(Item item) {
    if(item==null)
        throw new IllegalArgumentException();
    if(n>=a.length)
        resize(2*a.length);
        a[n]=item;
        n++;
    }
    
    /**
     * pops a least recent item in steque.
     * @return Item object from steque.
     */
    public Item pop() {
    if(isEmpty())
        throw new NoSuchElementException();
    Item item=a[n-1];
    a[n-1]=null;
    n--;
    return item;
    }
    
    /**
     * checks to see if steque is empty.
     * @return true if steque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return n==0;

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
