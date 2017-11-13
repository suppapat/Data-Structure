/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author usci
 */
public class MyNode {
    private Object data;
    private MyNode next;
    
    public MyNode (Object o,MyNode n){
        data=o;
        next=n;
    }

    public Object getData() {
        return data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
    
    
}
