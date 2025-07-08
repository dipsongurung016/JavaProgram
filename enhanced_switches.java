import java.util.Scanner;

public class enhanced_switches {
    public
    static void main(String[] args){

        // Enhanced switch = A replacement to many else if statements
        //                   (java14 features)

        Scanner scanner= new Scanner(System.in);

        System.out.print("enter the day of the week: ");
        String day=scanner.nextLine();

//        switch(day){
//            case "sunday" -> System.out.println("Today is sunday");
//            case "monday" -> System.out.println("Today is monday");
//            case "tuesday" -> System.out.println("Today is tuesday");
//            case "wednesday" -> System.out.println("Today is wednesday");
//            case "thursday" -> System.out.println("Today is thursday");
//            case "friday" -> System.out.println("Today is friday");
//            case "saturday" -> System.out.println("Today is saturday");
//
//            default -> System.out.println(day + " is not a day");
   //     }

        switch(day){
            case "monday","tuesday","wednesday","thursday","friday" -> System.out.println("it is a weekday😢");
            case "sunday","saturday" -> System.out.println("it is the weekend🥳");
            default -> System.out.println(day+" is not a day");

        }
    }
}
