package Units;
import java.util.ArrayList;

public class Robots extends Schoolers {
    protected String rusName;
    public Robots (ArrayList<BaseUnit> name){
        super(name, 4, 30);
        this.rusName = "Робот";
    }

    @Override
    public String getInfo() {
        return this.rusName;
    }
}
