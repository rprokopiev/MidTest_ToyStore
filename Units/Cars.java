package Units;
import java.util.ArrayList;

public class Cars extends PreSchoolToys{
    protected String rusName;
    public Cars(ArrayList<BaseUnit> name){
        super(name, 2, 30);
        this.rusName = "Машинка";
    }
    
    @Override
    public String getInfo() {
        return this.rusName;
    }
}
