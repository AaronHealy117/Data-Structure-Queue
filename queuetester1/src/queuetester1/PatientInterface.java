/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetester1;

/**
 *
 * @author Kaos117
 */
public interface PatientInterface {
    
    public boolean isEmpty();
    public int size();
    public Object dequeue();
    public  Object frontElement();
    public void enqueue(Object newItem);
    
}
