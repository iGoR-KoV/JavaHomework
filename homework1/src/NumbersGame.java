import java.util.Scanner;
import java.util.Random;

public class NumbersGame {

    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = nameInput.nextLine();
        System.out.println("Let the game begin!");

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        Scanner numberInput = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter your number: ");
            number = numberInput.nextInt();
            if (number < randomNumber){
                System.out.println("Your number is too small. Please, try again.");
            }
            if (number > randomNumber){
                System.out.println("Your number is too big. Please, try again.");
            }
            if (number == randomNumber){
                System.out.println("Congratulation, " + name + "!");
            }
        } while (number != randomNumber);
    }
}
