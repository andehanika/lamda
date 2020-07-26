import java.util.*; 
import java.util.stream.IntStream; 
  
class averageoflist { 
  
    public static void main(String[] args) 
    { 
        IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8,10);  
        OptionalDouble k = stream.average(); 
        if (k.isPresent()) { 
            System.out.println(k.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    }
}