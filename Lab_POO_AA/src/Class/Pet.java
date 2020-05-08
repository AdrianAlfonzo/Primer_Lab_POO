package Class;

/**
 *
 * @author AA2020
 */
public class Pet {
    private String _petName;
    private String _petColor;
    private String _petSize;
    private String _petGenre;
    public String _animalType;

    
    public Pet(String petName, String petColor, String petSize, String petGenre, String animalType) {
        this._petName = petName;
        this._petColor = petColor;
        this._petSize = petSize;
        this._petGenre = petGenre;
        this._animalType = animalType;
    }
    
    
    public String MakeSex(){
        return "Looking for a partner";
    }
    

    public String GetName() {
        return _petName;
    }
    public void SetName(String petName) {
        this._petName = petName;
    }
    
    
    public String GetColor() {
        return _petColor;
    }
    public void SetColor(String petColor) {
        this._petColor = petColor;
    }


    public String GetSize() {
        return _petSize;
    }
    public void SetSize(String petSize) {
        this._petSize = petSize;
    }
    
    
    public String GetGenre() {
        return _petGenre;
    }
    public void SetGenre(String petGenre) {
        this._petGenre = petGenre;
    }
}
