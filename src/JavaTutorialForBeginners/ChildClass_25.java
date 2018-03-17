package JavaTutorialForBeginners;


public class ChildClass_25 extends BaseClass_25 {
    
    /* super keyword METHOD EXAMPLE */
    
    public void printSomething() {
        super.printSomething();
        System.out.println("This was printed from child class");
        
    }
    
    public static void main(String[] args) {
        
        ChildClass_25 testSuper = new ChildClass_25();
        
        testSuper.printSomething();
    }




}
