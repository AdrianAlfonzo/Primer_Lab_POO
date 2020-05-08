package Class;

/**
 *
 * @author AA2020
 */
public class Reptile extends Pet{
    private String _reptileSpecie;
    private String _reptileVenom;

    
    public Reptile(String reptileSpecie, String reptileVenom, String reptileName, String reptileColor, String reptileSize, String reptileGenre, String animalType) {
        super(reptileName, reptileColor, reptileSize, reptileGenre, animalType);
        this._reptileSpecie = reptileSpecie;
        this._reptileVenom = reptileVenom;
        this._animalType = animalType;
    }
    
    
    public String GenerateSound(){
        return "Tsssst!";
    }
    
    
    public String Eat(){
        return this.GetName() + " wants to eat MEAT, is hungry";
    }
    
    
    @Override
    public String MakeSex(){
        return this.GetName() + " is expecting to make sex";
    }


    public String GetReptileSpecie() {
        return _reptileSpecie;
    }
    public void SetReptileSpecie(String reptileSpecie) {
        this._reptileSpecie = reptileSpecie;
    }


    public String GetReptileVenom() {
        return _reptileVenom;
    }
    public void SetReptileVenom(String reptileVenom) {
        this._reptileVenom = reptileVenom;
    }
}
