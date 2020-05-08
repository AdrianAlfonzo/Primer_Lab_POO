package Class;

/**
 *
 * @author AA2020
 */
public class Rodent extends Pet{
    private String _rodentSpecie;
    private String _rodentFood;

    
    public Rodent(String rodentSpecie, String rodentFood, String rodentName, String rodentColor, String rodentSize, String rodentGenre, String animalType) {
        super(rodentName, rodentColor, rodentSize, rodentGenre, animalType);
        this._rodentSpecie = rodentSpecie;
        this._rodentFood = rodentFood;
        this._animalType = animalType;
    }
    
    
    public String GenerateSound(){
        return "Qiuh, Qiuh, Qiuh!";
    }
    
    
    public String Eat(){
        return this.GetName() + " wants to eat SOME PLANTS, is hungry";
    }
    
    
    @Override
    public String MakeSex(){
        return this.GetName() + " is expecting to make sex";
    }

    
    public String GetRodentSpecie() {
        return _rodentSpecie;
    }
    public void SetRodentSpecie(String rodentSpecie) {
        this._rodentSpecie = rodentSpecie;
    }

    
    public String GetRodentFood() {
        return _rodentFood;
    }
    public void SetRodentFood(String rodentFood) {
        this._rodentFood = rodentFood;
    }
}
