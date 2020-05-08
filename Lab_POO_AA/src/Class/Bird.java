package Class;

/**
 *
 * @author AA2020
 */
public class Bird extends Pet{
    private String _birdType;
    private String _birdFood;
    
    
    public Bird(String birdType, String birdFood, String birdName, String birdColor, String birdSize, String birdGenre, String animalType) {
        super(birdName, birdColor, birdSize, birdGenre, animalType);
        this._birdType = birdType;
        this._birdFood = birdFood;
        this._animalType = animalType;
    }
    
    
    public String GenerateSound(){
        return "Tweet, Tweet, Tweet!";
    }
    
    
    public String Eat(){
        return this.GetName() + " wants to eat SEEDS, is hungry";
    }
    
    
    @Override
    public String MakeSex(){
        return this.GetName() + " is expecting to make sex";
    }

    
    public String GetBirdType() {
        return _birdType;
    }
    public void SetBirdType(String birdType) {
        this._birdType = birdType;
    }

    
    public String GetBirdFood() {
        return _birdFood;
    }
    public void SetBirdFood(String birdFood) {
        this._birdFood = birdFood;
    }
}
