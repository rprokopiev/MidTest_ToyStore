package Units;

import java.util.ArrayList;

public interface UnitInterface {
    void play(ArrayList<BaseUnit> betToys);
    
    String getInfo();

    String getName();

    void changeFrequency(BaseUnit toy, Integer newFriquency);
}
