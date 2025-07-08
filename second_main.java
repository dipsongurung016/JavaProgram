import java.util.Scanner;

public class second_main {
    public static void  main(String[] args){

 //       Scanner sc=new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name= sc.nextLine();

//        System.out.print("Entre your age: ");
//        int age= sc.nextInt();
//
//        System.out.print("Whats your gpa? : ");
//        double gpa=sc.nextDouble();
//
//        System.out.print("Are you a student? (true/false) : ");
//        boolean choice=sc.nextBoolean();
//
//        System.out.println("\nHello! "+ name);
//        System.out.println("Your age is " + age);
//        System.out.println("Your gpa is "+gpa);
//
//        if(choice){
//            System.out.println("You are a student.");
//        }
//        else{
//            System.out.println("You are not a student.");
//        }

        //           part 2
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age= sc.nextInt();
        sc.nextLine(); //clears input buffer

        System.out.print("Enter your name: ");
        String name= sc.nextLine();

        System.out.println("Your age is "+age);
        System.out.println("Your name is "+ name);


        sc.close();
    }
}
