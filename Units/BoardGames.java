package Units;
import java.util.ArrayList;

public class BoardGames extends Schoolers{
    protected String rusName;
    public BoardGames(ArrayList<BaseUnit> name) {
        super(name, 5, 30);
        this.rusName = "Настольная игра";
    }

    @Override
    public String getInfo() {
        return this.rusName;
    }
}