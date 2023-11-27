/**
 * ACS-1903 Lab 11 Q7
 * @author (enter your name and student number)
 */
public class Food{
    // fields
    private static int nextID = 201;
    private String name;
    private int calories;
    private int foodId;

    // constructors
    public Food(){
        name = "unknown";
        calories = 0;
        foodId = getNextID();
    }
    
    public Food(String name, int calories){
        this.name = name;
        this.calories = calories;
        foodId = getNextID();
    } 
    
    private int getNextID(){
        return nextID++;
    }

    // getters and setters
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getCalories(){
        return calories;
    }
    
    public void setCalories(int calories){
        this.calories = calories;
    }

    // other methods
    
    @Override
    public String toString(){
        String st = foodId + ": " + name + ", " + calories + " calories.";
        return st;
    }
    
    /* one possible implementation of the
     * energy method. This one is
     * less desirable in that it takes an
     * argument when it doesn't need to
     */
    public double energyInKJ(int clories){
        return calories * 4.184;
    }// end energy in kj
    
    /* this one is preferable because
     * it uses the private field calories
     * directly so there is no possiblity
     * that the calculation will be made
     * with incorrect data
     */
    public double energyInKJ(){
        return calories * 4.184;
    }// energy in kj no-arg

    
    
}
