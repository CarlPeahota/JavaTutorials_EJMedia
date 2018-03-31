package JavaTutorialForBeginners;

//This is the MAIN PROGRAM. Planet.java is an example subclass that uses this
public class AllPlanets {

    public static void main(String[] args) {

        Planet Earth = new Planet (); //This is a version of the Planet Template and this version is called "Earth"
        
        Earth.size = 25000;  //Size is the attribute for the new object
        
        Earth.displaySize();

    }
}