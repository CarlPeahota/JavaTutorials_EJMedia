package JavaTutorialForBeginners;

//NOTE: this class does not use the "static void" code since this IS NOT the main program. This will be called by the main program!!!
//BTW, the main program is the AllPlanets class

//This can be used by other programs since its public
public class Planet {
    //this is the attribute that is part of the difinition of a Java object
    int size;
    
    //this is the method that is part of the difinition of a Java object
    public void displaySize() {
    
        System.out.println("Size of the planet is " + size);
}
    
    
}
