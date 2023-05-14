package Units;
import java.util.ArrayList;

public class SoftToys extends PreSchoolToys{
    protected String rusName;
    public SoftToys(ArrayList<BaseUnit> name){
        super(name, 1, 20);
        this.rusName = "Мягкая Игрушка";
    }
    
    @Override
    public String getInfo() {
        return this.rusName;
    }
}
