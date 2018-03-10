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
public class Addition {
    
    int firstNumber;
    int secondNumber;
    
    public int getNumber() {
        
        return (firstNumber + secondNumber);
        
    }
    
    //THE CONSTRUCTORS MUST HAVE THE SAME NAME AS THE CLASS!!!!
    
    Addition () {
        //these are default constructors
        firstNumber = 10;
        secondNumber = 20;
        
    }
    
    Addition (int L, int B) {
        //This is a variable constructor (values get passed into it). L and B are just place holders
        firstNumber = L;
        secondNumber = B;
    }
}
