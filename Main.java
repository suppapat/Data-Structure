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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CirLink a=new CirLink();
        a.add((Integer)20);
        a.printList();
        a.add((Integer)30);
        a.printList();
        a.add((Integer)50);
        a.printList();
        a.add((Integer)80);
        a.printList();
        a.remove((Integer)20);
        a.printList();
        a.remove((Integer)50);
        a.printList();
        a.remove((Integer)90);
        a.printList();
        System.out.println(a.contain((Integer)30));
        System.out.println(a.contain((Integer)100));
//        a.remove((Integer)80);
//        a.printList();

    }
    
}
