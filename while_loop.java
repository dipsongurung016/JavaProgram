import java.util.Scanner;

public class while_loop {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age=scanner.nextInt();

        while(age < 1 || age>100){
            System.out.println("not a valid age");
            System.out.print("Enter your age: ");
            age=scanner.nextInt();
        }
        System.out.println("your age is: "+ age);

//        do{
//            System.out.println("not a valid age");
//            System.out.print("Enter your age: ");
//            age=scanner.nextInt();
//        }while(age < 1 || age>100);
//        System.out.println("your age is: "+ age);
    }
}
