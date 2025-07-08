public class first_main {

    public static void main(String[] args) {
        // This is a single line comment
        /*
        THIS IS A MULTI-LINE COMMENT
        System.out.print("HELLO! WORLD\n");
         */
        System.out.print("OHH HELL NAHHH\n");
        System.out.print("Hello\t");
        System.out.println("World");


        // Variables
        //primitive = simple values stored directly in memory (stack)
        //reference = memory address (stack) that points to the (heap)

        // ##Types of primitive data types
        // 1.int
        int age, year = 2025;
        age = 21;
        System.out.println(age);
        System.out.println(year);

        // 2.double
        double temperature = 25.5;
        System.out.println("the temperature is " + temperature);

        // 3.char= character , symbols , uses single quote
        char grade = 'A';
        char symbol = '!';
        System.out.println(grade);
        System.out.println(symbol);

        // 4.boolean
        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);
/*
        if(isStudent){
            System.out.println("You are a student");
        }
        else
        {
            System.out.println("You are not a student");
        }

 */
//recap: int, double, char, boolean are the primitive data types

        //reference data types

        // 1. string
        String name = "Dipson Gurung";
        String food = "pizza";
        System.out.println("Hello " + name + "." + "\nIs your favourite food " + food + "?");

        //HW
        boolean test=true;
        int yearr = 2023;
        double pie = 3.14;
        char currency = '$';
        String namee = "Dipson Gurung";

        if (test) {
            System.out.println("In year " + yearr + "," + " the price of pi was " + currency + pie + ".");
        } else {
            System.out.println("In year " + yearr + "," + " the price of pi was not " + currency + pie + "");
        }


    }
}
