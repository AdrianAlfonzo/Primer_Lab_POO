package Class;

/**
 *
 * @author AA2020
 */
public class Animals {
    private Fish _fish;
    private Bird _bird;
    private Rodent _rodent;
    private Reptile _reptile;
    private Bug _bug;
    
    
    public Animals(){
    
    }

    
    public Animals(Fish fishObj, Bird birdObj, Rodent rodentObj, Reptile reptileObj, Bug bugObj) {
        this._fish = fishObj;
        this._bird = birdObj;
        this._rodent = rodentObj;
        this._reptile = reptileObj;
        this._bug = bugObj;
    }


    public Fish GetFish() {
        return _fish;
    }
    public void SetFish(Fish fishObj) {
        this._fish = fishObj;
    }
    
    
    public Bird GetBird() {
        return _bird;
    }
    public void SetBird(Bird birdObj) {
        this._bird = birdObj;
    }

    
    public Rodent GetRodent() {
        return _rodent;
    }
    public void SetRodent(Rodent rodentObj) {
        this._rodent = rodentObj;
    }

    
    public Reptile GetReptile() {
        return _reptile;
    }
    public void SetReptile(Reptile reptileObj) {
        this._reptile = reptileObj;
    }
    
    
    public Bug GetBug() {
        return _bug;
    }
    public void SetBug(Bug bugObj) {
        this._bug = bugObj;
    }
}
