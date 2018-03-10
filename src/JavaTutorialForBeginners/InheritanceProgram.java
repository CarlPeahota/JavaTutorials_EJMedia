package JavaTutorialForBeginners;

public class InheritanceProgram {

    //This is the actual program
    
    public static void main (String[] args) {
        
        GumDrops Red = new GumDrops(); 
        GumDrops Green = new GumDrops();
        
        Red.givemeCinnamon();
        Red.SugarAmount = 10;
        Red.displaySugarAmount();

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        Green.givemeSpearmint();
        Green.SugarAmount = 9;
        Green.displaySugarAmount();

        
    }
}