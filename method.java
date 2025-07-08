import java.util.Scanner;

public class method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your age: ");
        int age = scanner.nextInt();

        isElligible(age);



//        String FirstName="Dipson";
//        String LastName="Gurung";
//        String name=getFullName(FirstName,LastName);
//        System.out.println(name);
    }

    static void info(String name, int age) {
        System.out.println("My name is " + name);
        System.out.printf("I am %d years old.\n", age);
        System.out.println("I am from Tanahun\n");
    }

    static void isElligible(int age) {

        if (age >= 18) {
            System.out.println("You are elligible to vote");
        }

    }

    static String getFullName(String FirstName, String LastName){
        return (FirstName+" "+LastName);
    }


}


// method == function == a reusable block of code that is executed when called ()
