import java.util.Scanner;

public class temperature_converter_program {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        //TEMPERATURE CONVERTER

        //declare variable
        double celsius;
        double fahrenheit;
        int choice;

        //choices
        System.out.println("TEMPERATURE CONVERTER");
        System.out.println("1. celsius to fahrenheit");
        System.out.println("2. fahrenheit to celsius");

        //enter choice
        System.out.print("Enter your choice: ");
        choice=scanner.nextInt();

        //logic
        if(choice==1){
            System.out.print("Enter temperature in Celsius: ");
            celsius=scanner.nextDouble();

            fahrenheit=(((9.0/5)*celsius)+32);

            System.out.printf("%.2f°C = %.2f°F",celsius,fahrenheit);
        }
        else if(choice==2){
            System.out.print("Enter temperature in Fahrenheit: ");
            fahrenheit=scanner.nextDouble();

            celsius=((fahrenheit-32)*(5.0/9));

            System.out.printf("%.2f°F = %.2f°C",fahrenheit,celsius);
        }
        else{
            System.out.println("invalid choice");
        }
        scanner.close();
    }
}
