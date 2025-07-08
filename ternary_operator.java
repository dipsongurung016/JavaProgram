import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        //variable declaration
        int score;

        //user input
        System.out.print("enter your score: ");
        score=scanner.nextInt();

        //use ternary opertor
        String result = (score>=40) ? "PASS" : "FAIL";

        //prints result
        System.out.println(result);
    }
}
