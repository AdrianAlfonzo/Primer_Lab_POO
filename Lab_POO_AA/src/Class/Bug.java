package Class;

/**
 *
 * @author AA2020
 */
public class Bug extends Pet{
    private String _bugSpecie;
    private String _bugVenom;

    
    public Bug(String bugSpecie, String bugVenom, String bugName, String bugColor, String bugSize, String bugGenre, String animalType) {
        super(bugName, bugColor, bugSize, bugGenre, animalType);
        this._bugSpecie = bugSpecie;
        this._bugVenom = bugVenom;
        this._animalType = animalType;
    }
    
    
    public String GenerateSound(){
        return "Unknown";
    }
    
    
    public String Eat(){
        return this.GetName() + " wants to eat TRASH, is hungry";
    }
    
    
    @Override
    public String MakeSex(){
        return this.GetName() + " is expecting to make sex";
    }


    public String GetBugSpecie() {
        return _bugSpecie;
    }
    public void SetBugSpecie(String bugSpecie) {
        this._bugSpecie = bugSpecie;
    }


    public String GetBugVenom() {
        return _bugVenom;
    }
    public void SetBugVenom(String bugVenom) {
        this._bugVenom = bugVenom;
    }
}
