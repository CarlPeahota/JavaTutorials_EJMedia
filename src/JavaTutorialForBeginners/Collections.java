package JavaTutorialForBeginners;

import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) {
        ArrayList<Integer> testCollection = new ArrayList<Integer> ();
        testCollection.add(12); // this would have an index of 0.
        testCollection.add(33);
        testCollection.add(45);
        testCollection.add(69);
        
        System.out.println(testCollection);
        
        testCollection.remove (1); //remove index 1
        
        System.out.println(testCollection);
        
        testCollection.add (175);
        testCollection.add (2002);
        
        System.out.println(testCollection);
        
    }
}
