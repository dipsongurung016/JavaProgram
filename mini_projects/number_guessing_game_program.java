import java.util.Random;
import java.util.Scanner;

public class number_guessing_game_program {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess, randomNumber;
        int attempts = 0;
        int min=1;
        int max=100;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Guess any number between 1 to 100");

        randomNumber=random.nextInt(min,max+1);

        do{
            System.out.print("enter your guess: ");
            guess=scanner.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("TOO LOW!! GUESS HIGH");
            }
            else if(guess>randomNumber){
                System.out.println("TOO HIGH!!! GUESS LOW");
            }
        }while(guess != randomNumber);

        System.out.println("CORRECT");
        System.out.println("# of attempts = " + attempts);

    }
}
