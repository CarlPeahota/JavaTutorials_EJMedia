package JavaTutorialForBeginners;

public class Food {

private String foodA;

public Food (String A){
    
    foodA = A;  //this is a fake value
    
}

public String getFood () {
    
    return foodA;  //use return when a value is returned
}

void systemPrint () { //void only if nothing is returned
    
    System.out.println(foodA);
}
    
}
