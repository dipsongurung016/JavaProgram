import java.util.Scanner;

public class Mad_libs_game_Program {
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);

        String F_Name;
        String L_word2;
        int age;
        double height;
        String games;

        System.out.print("What is your first name? : ");
        F_Name=sc.nextLine();

        System.out.print("What is your last name? : ");
        L_word2=sc.nextLine();

        System.out.print("what is your age? : ");
        age=sc.nextInt();

        System.out.print("What is your height (in cm)? : ");
        height=sc.nextDouble();
        sc.nextLine();

        System.out.print("What is your favourite game? ; ");
        games=sc.nextLine();

        System.out.print("My name is "+ F_Name +" " +L_word2+". ");
        System.out.print("I am "+ age+" years old. ");
        System.out.print("My height is "+ height+" cm ");
        System.out.print("and I love playing "+ games);

        sc.close();
    }
}
