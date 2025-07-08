import java.util.Scanner;

public class logical_operator {
    public static void main(String[] args)
    {
        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner=new Scanner(System.in);

        String username;

        System.out.print("Enter your new username: ");
        username= scanner.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.println("Username must be in between (4-12) characters!!");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain space and underscore");
        }
        else {
            System.out.println("Welcome " + username);
        }
        scanner.close();
    }
}
