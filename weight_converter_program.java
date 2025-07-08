import java.util.Scanner;

public class weight_converter_program {
    public static void main(String[] args){

        //weight conversion program

        Scanner scanner=new Scanner(System.in);

        //declare variable
        double weight;
        double newWeight;
        int choice;

        //prompt for user choice
        System.out.println("Weight Conversion Program: ");
        System.out.println("1. lbs to kgs");
        System.out.println("2. kgs to lbs");

        System.out.print("enter your choice: ");
        choice=scanner.nextInt();

        if(choice==1){
            System.out.print("\nEnter weight in lbs: ");
            weight=scanner.nextDouble();
            newWeight=weight*0.45;
            System.out.printf("%.2f lbs = %.2f kg",weight,newWeight);
        }
        else if(choice==2)
        {
            System.out.print("\nEnter weight in kg/s: ");
            weight=scanner.nextDouble();
            newWeight=weight*2.20;
            System.out.printf("%.2f kg/s = %.2f lbs",weight,newWeight);
        }
        else {
            System.out.println("invalid choice");
        }

    }
}
