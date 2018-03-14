package JavaTutorialForBeginners;

public class Differences {


    String b = "Object/Instance Variable B";
    String c = "Object/Instance Variable C";
    
    public Differences () {  //DEFAULT CONSTRUCTOR / NO VOID AND NO RETURN
                             // PUBLIC AND ACCESS MODIFIERS OK TO ALL / NO STATIC
        
        String a = "Local variable A";
        System.out.println(a + " Printed from Constructor method");
    }

    public void printString () {  // VOID METHOD / PUBLIC AND ACCESS MODIFIERS OK TO ALL / NO RETURN METHOD
        System.out.println(b + " Printed from printString method");
    }
    
    public String returnValue () {   //RETURN VALUE METHOD / PUBLIC AND ACCESS MODIFIERS OK TO ALL / NO STATIC
        return c;
    }
    
    
    public static void main(String[] args) {
        Differences testObj = new Differences ();  // constructor
        
        testObj.printString();
        System.out.println(testObj.returnValue() + " Printed from returnValue method");
        
    }
    
    
}
