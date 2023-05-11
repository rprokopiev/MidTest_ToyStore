import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Units.BaseUnit;
import Units.BoardGames;
import Units.Cars;
import Units.Constructors;
import Units.Dolls;
import Units.Robots;
import Units.SoftToys;

public class Init {

    public static void WriteFile () {
        Scanner scanner = new Scanner(System.in);
        Integer playerType = View.GetRequiredIntegerFromUser("Select: 1 - PreSchooler; 2 - Schooler", scanner, 1, 2);
        Integer toysQty = View.GetRequiredIntegerFromUser("Enter quantity of toys in game between 1 and 10", scanner, 1, 10);
        ArrayList <BaseUnit> toyList = new ArrayList<BaseUnit>();
        if (playerType == 1){
            toyList = PreschArray(toysQty);
            System.out.println(toyList);
            System.out.println(toyList);
        }
        else{
            toyList = SchoolersArray(toysQty);
            System.out.println(toyList);
            System.out.println(toyList);
        }
    }

    private static ArrayList <BaseUnit> SchoolersArray (Integer qty){
        ArrayList <BaseUnit> list = new ArrayList<>();
        for (int i = 0; i < qty; i++) {
            switch (new Random().nextInt(3)) {
                case 0:
                    list.add(new BoardGames(list));
                    break;
                case 1:
                    list.add(new Constructors(list));
                    break;
                default:
                    list.add(new Robots(list));
                    break;
            }
        }
        return list;
    }

    private static ArrayList <BaseUnit> PreschArray (Integer qty){
        ArrayList <BaseUnit> list = new ArrayList<>();
        for (int i = 0; i < qty; i++) {
            switch (new Random().nextInt(3)) {
                case 0:
                    list.add(new Dolls(list));
                    break;
                case 1:
                    list.add(new SoftToys(list));
                    break;
                default:
                    list.add(new Cars(list));
                    break;
            }
        }
        return list;
    }
}