/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetester1;
import java.util.*;
/**
 *
 * @author Kaos117
 */
public class MyPatient implements PatientInterface{
    
    private ArrayList<Patient> theQ;
    
    public MyPatient(){
        theQ = new ArrayList<Patient>();
    }

    
   public boolean isEmpty(){
       return theQ.isEmpty();
   }
    
   public int size(){
       return theQ.size();
   }
    
   public Object frontElement(){
       if(!theQ.isEmpty()){
           return theQ.get(0);
       }
       else{
           return null;
       }
   }
    
   public Object dequeue(){
       if(!theQ.isEmpty()){
           return theQ.remove(0);
       }
       else{
           return null;
       }
   }
   
   public void enqueue(Object newItem){
        theQ.add((Patient) newItem);
   }
}
