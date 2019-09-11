import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String newColor;

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("blue");
        list.add("yellow");
        list.add("green");

        while (true) {


            System.out.println(list);
            System.out.println("please choose a color to add ");
            System.out.print("> ");


            newColor = keyboard.next();

            list.add(newColor);


//            System.out.println(list);


            if (newColor.equalsIgnoreCase("q"))
                break;


        }
    }
}

