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
public interface Collection {
    public void add (Object o);
    public void remove (Object o);
    public boolean contain (Object o);
    public boolean isEmpty ();
    public int size();
}
