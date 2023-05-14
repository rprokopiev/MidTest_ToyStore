package Units;
import java.util.ArrayList;

public class Dolls extends PreSchoolToys{
    protected String rusName;
    public Dolls(ArrayList<BaseUnit> name){
        super(name, 2, 30);
        this.rusName = "Кукла";
    }

    @Override
    public String getInfo() {
        return this.rusName;
    }
}

