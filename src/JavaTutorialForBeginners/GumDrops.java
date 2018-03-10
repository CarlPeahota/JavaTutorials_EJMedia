package JavaTutorialForBeginners;

public class GumDrops extends Candy {
    
    //This is a subclass of the Candy class...noted above by the "extends"
    
    String Cinnamon = "Cinnamon";
    String Spearmint = "Spearmint";
    
    //This is the method for this class object
    void givemeCinnamon() {
        System.out.println("This is a " + Cinnamon + " gumgrop");
    }

    //This is another method for this class object
    void givemeSpearmint() {
        
        System.out.println("This is a " + Spearmint + " gumgrop");
        
    }    
    
    
    
}