package JavaTutorialForBeginners;

public class arrays {
    public static void main (String[] args) {
        //This is one way of declaring an array. Call it (1)
        int[] numbers;
        
        //..and this is another, more compact way of defining an array. Call it (2)
        int[] numbs = {5,9,45};
        
        //This entire section below is used w/ (1) 
        numbers = new int[5];
        numbers [0] = 35;
        numbers [1] = 65;
        numbers [2] = 135;
        numbers [3] = 335;
        numbers [4] = 535;
        
        
        
        System.out.println (numbers[1]);
        System.out.println (numbs[1]);
    }
}
