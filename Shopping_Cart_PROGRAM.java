import java.util.Scanner;

public class Shopping_Cart_PROGRAM {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("What would you like to buy?: ");
        String itemName=sc.nextLine();

        System.out.print("What is the price for each?: ");
        double price= sc.nextDouble();

        System.out.print("How many would you like?: ");
        int quantity=sc.nextInt();

        System.out.println("\nYou have Bought "+ quantity +" " + itemName+"/s.");
        System.out.println("Your total is $"+price*quantity);

        sc.close();

    }
}
