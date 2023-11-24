/**
 * ACS-1903 Lab 11 Q8
 * @author (enter your name and student number)
 */
import java.util.ArrayList;

public class FoodDriver{
    public static void main(String[] args){        
        ArrayList<Food> menu = new ArrayList<>();
        menu.add(new Food("Burger", 500));
        menu.add(new Food("Fries", 300));
        menu.add(new Food("Salad", 140));
        menu.add(new Food("Cookie", 210));
        
    // add your code here
    
        for(Food f : menu){
            System.out.println(f);
        }
        
        System.out.println();
        //System.out.println("A cookie has " + menu.get(3).energyInKJ(menu.get(3).getCalories()) + " KJ.");
        
        // could print the cookie this way as well
        //Food cookie = menu.get(3);
        //System.out.println("A cookie has " + cookie.energyInKJ(cookie.getCalories()) + " KJ.");
        
        // or this way
        int calories = menu.get(3).getCalories();
        double kj = menu.get(3).energyInKJ(calories);
        System.out.println("A cookie has " + kj + " KJ.");
        
    }
}
