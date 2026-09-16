package solid;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RocknPaper game1 = new RocknPaper();
        System.out.println("Choose the option");
        game1.options();

        Scanner scanner = new Scanner(System.in);
        int gameOption =  scanner.nextInt();
        int userInput = scanner.nextInt();

        while (userInput >3){
            System.out.println("Invalid Option");
        }

        int conputerInput = game1.computer();


        System.out.println(game1.gameRules(userInput, conputerInput));



    }
}