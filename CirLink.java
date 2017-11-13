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
public class CirLink implements Collection {
    private MyNode last;
    private int size;
    
    public CirLink(){
        last=null;
        size=0;
    }

    @Override
    public void add(Object o) {
        if(contain(o)) {System.out.println("มีอยู่แล้ว");return;}
        else if(last==null){
            MyNode n=new MyNode(o,null);
            last=n;
            last.setNext(last);
            size++;
        }
        else{
            MyNode s=last;
            MyNode n = new MyNode(o,s.getNext());
            last.setNext(n);
            size++;
        }
    }

    @Override
    public void remove(Object o) {
        MyNode s=last.getNext();
        MyNode p=s;
        if(isEmpty())return;
        else if(s.getData().equals(o)){
            last.setNext(s.getNext());
        }
        else if(last == last.getNext()&&s.getData().equals(o)) {last=null; size--; return;}
        else {
            do{
                if(s.getData().equals(o)) {
                    p.setNext(s.getNext());
                    size--;
                    return;
                }
                p=s;
                s=s.getNext();
                //System.out.print("bb ");
            }while(s!=last);
            if(s==last&&s.getData().equals(o)){
                p.setNext(s.getNext());
                last=p;
                size--;
                //System.out.print("aa");
            }
            System.out.println("ไม่มี");
        }
    }

    @Override
    public boolean contain(Object o) {
        if(isEmpty())return false;
        else {
            MyNode s=last;
            do{
                if(s.getData().equals(o)) return true;
                s=s.getNext();
            }while(s!=last); return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if(last==null) return true;
        else return false;
    }

    @Override
    public int size() {
        return size;
    }
    
    public void printList(){
        MyNode s=last.getNext();
        do{
            System.out.print(s.getData()+" ");
            s=s.getNext();
        }while(s!=last.getNext());  
        //System.out.print(last.getData()+" ");
        System.out.println();
    }
    
}
