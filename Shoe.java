
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
 */

public class Shoe{

    private String id;
    
    public String getID(){
        return this.id;
    }

    // equals
    public boolean equals(Shoe os){
        return this.getID().equals(os.getID());

        // or

        //return this.id.equals(os.id);
    }// end equls
}
