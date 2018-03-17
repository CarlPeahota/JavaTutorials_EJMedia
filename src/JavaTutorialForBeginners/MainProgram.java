/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTutorialForBeginners;

/**
 *
 * @author cpeahota
 */
public class MainProgram {
    
    public static void main(String[] args) {
    
        ClassA newobj = new ClassA ();  //create new object of ClassA called "newobj"
        System.out.println(newobj.a);   //prints out th object "a" from newobj
        newobj.sendMessage(); //Envoke one of the methods from newobj
        
        //now doing it for ClassB
        ClassB newobj1 = new ClassB ();
        System.out.println(newobj1.b);
        
        
    }
}
