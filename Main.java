import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Units.BaseUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <BaseUnit> list = GetToyList.GetList();
        Boolean check = Step.ifArrayEmpty(list);
        try(FileWriter file = new FileWriter("Список Игрушек")){
            while(check == false){
                String i = Step.Step(list);
                scan.nextLine();
                System.out.printf("%s", i);
                System.out.println();
                file.append(i);
                file.append('\n');
                check = Step.ifArrayEmpty(list);
            }
        }
        catch (IOException ex) {
            System.err.println("Ошибка" + ex);
        }
        System.out.println("Розыгрыш закончен");
        scan.close();
    }
}