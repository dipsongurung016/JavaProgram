import java.util.Random;
import java.util.Scanner;

public class dice_roller_program {
    public static void main(String[] args){

        int total=0;

        Scanner scanner=new Scanner(System.in);
        Random random = new Random();

        System.out.print("enter # of dice to roll: ");
        int numberOfDice=scanner.nextInt();

        for(int i=0 ;i<numberOfDice;i++){
            int diceNumber=random.nextInt(1,7);
            diceAnimation(diceNumber);
            System.out.println("You rolled: "+diceNumber+"\n");
            total+=diceNumber;
        }
        System.out.println("Total: " + total);
    }
    static void diceAnimation(int diceNumber){
        String dice1= """
                 -------
                |       |
                |   ●   |
                |       |
                 _______
                """;
        String dice2= """
                 -------
                | ●     |
                |       |
                |     ● |
                 _______
                """;
        String dice3= """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 _______
                """;
        String dice4= """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 _______
                """;
        String dice5= """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 _______
                """;
        String dice6= """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 _______
                """;
        switch (diceNumber){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid choice");
        }
    }
}
