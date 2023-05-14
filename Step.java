import java.util.ArrayList;

import Units.BaseUnit;

public class Step {

    public static Boolean ifArrayEmpty(ArrayList <BaseUnit> list){
        Boolean j = true;
        if (list.size() > 0) {
            j = false;
        }
        return j;
    }

    public static String Step(ArrayList <BaseUnit> list){
        String i = list.get(0).getInfo();
        list.remove(0);
        return i;
    }
}