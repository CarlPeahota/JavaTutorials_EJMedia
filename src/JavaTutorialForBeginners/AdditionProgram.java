/*
Uses constructors from Addition.java
 */
package JavaTutorialForBeginners;

public class AdditionProgram {

    public static void main(String[] args) {
        
        Addition addobj = new Addition (79,21);
        Addition addobj1 = new Addition (100,21);
        
        System.out.println("The addition = "+ addobj.getNumber());
        System.out.println("The addition = "+ addobj1.getNumber());
        
    }

    
}
