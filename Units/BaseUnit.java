package Units;
import java.util.ArrayList;

public abstract class BaseUnit {

    public ArrayList<BaseUnit> name;
    protected int id;
    protected double frequency;
    
    public BaseUnit(ArrayList<BaseUnit> name, int id, double frequency){
        this.id = id;
        this.frequency = frequency;
    }
}