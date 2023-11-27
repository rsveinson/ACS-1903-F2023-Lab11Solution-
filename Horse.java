
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
 */

public class Horse{

    private String name;
    private int age;
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }

    // equals
    public boolean equals(Horse oh){
        boolean equal = this.getName().equals(oh.getName()) && this.getAge() == oh.getAge();
        //return equal;
        
        // or
        
        return this.getName().equals(oh.getName()) && this.getAge() == oh.getAge();

        // or
        
        //return this.name.equals(oh.name && this.age == oh.age);
    }// end equls
}
