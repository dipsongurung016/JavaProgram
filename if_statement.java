import java.util.Scanner;

public class if_statement {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        //if statement
        String name;
        int age;
        boolean isStudent;

        System.out.print("enter your name: ");
        name=sc.nextLine();

        System.out.print("enter your age: ");
        age=sc.nextInt();

        System.out.print("are u a student (true/false): ");
        isStudent=sc.nextBoolean();

        //Group 1
        if(name.isEmpty()){
            System.out.println("\nYou didn't enter your name!");
        }
        else{
            System.out.println("Hello! "+name);
        }


        //Group 2
        if(age>=18){
            System.out.println("You are an Adult");
        }
        else if(age<0){
            System.out.println("you haven't been born yet");
        }
        else if(age==0){
            System.out.println("you are a baby");
        }
        else{
            System.out.println("you are not an adult");
        }

        //Group 3
        if(isStudent)
        {
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

    }
}
