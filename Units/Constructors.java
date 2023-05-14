package Units;
import java.util.ArrayList;

public class Constructors extends Schoolers{
    protected String rusName;
    public Constructors(ArrayList<BaseUnit> name) {
        super(name, 6, 40);
        this.rusName = "Конструктор";
    }

    @Override
    public String getInfo() {
        return this.rusName;
    }
}
