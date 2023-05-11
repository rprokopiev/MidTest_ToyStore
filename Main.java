import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = View.GetRequiredIntegerFromUser("Enter ", scanner, 1, 4);
        System.out.println(a);
        Init.WriteFile();
    }
}