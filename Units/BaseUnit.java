package Units;
import java.util.ArrayList;

public abstract class BaseUnit implements UnitInterface{

    public ArrayList<BaseUnit> name;
    protected Integer id;
    protected Integer frequency;
    
    public BaseUnit(ArrayList<BaseUnit> name, Integer id, Integer frequency){
        this.id = id;
        this.frequency = frequency;
    }

    @Override
    public void changeFrequency(BaseUnit toy, Integer newFrequency) {
        this.frequency = newFrequency;
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getName() {
        return this.getClass().getName().split("\\.")[1];
    }

    @Override
    public void play(ArrayList<BaseUnit> betToys) {
        // TODO Auto-generated method stub
        
    }
    
}