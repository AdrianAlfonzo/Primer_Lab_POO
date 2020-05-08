package Class;

/**
 *
 * @author AA2020
 */
public class Fish extends Pet{
    private String _fishFood;
    private String _fishType;

    
    public Fish(String fishFood, String fishType, String fishName, String fishColor, String fishSize, String fishGenre, String animalType) {
        super(fishName, fishColor, fishSize, fishGenre, animalType);
        this._fishFood = fishFood;
        this._fishType = fishType;
        this._animalType = animalType;
    }
    
    
    public String GenerateSound(){
        return "Glooh, Glooh, Glooh!";
    }
    
    
    public String Eat(){
        return this.GetName() + " wants to eat LARVAES, is hungry";
    }
    
    
    @Override
    public String MakeSex(){
        return this.GetName() + " is expecting to make sex";
    }

    
    public String GetFishFood() {
        return _fishFood;
    }
    public void SetFishFood(String fishFood) {
        this._fishFood = fishFood;
    }


    public String GetFishType() {
        return _fishType;
    }
    public void SetFishType(String fishType) {
        this._fishType = fishType;
    }
}
