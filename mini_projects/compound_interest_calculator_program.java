import java.util.Scanner;

public class compound_interest_calculator_program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double p,r,A;
        int n,t;

        System.out.print("Enter Principal: ");
        p=scanner.nextDouble();

        System.out.print("Enter rate: ");
        r=scanner.nextDouble()/100;

        System.out.print("Enter n: ");
        n=scanner.nextInt();

        System.out.print("Enter time in years: ");
        t=scanner.nextInt();

        A=p*Math.pow((1+r/n),n*t);

        System.out.printf("So the amount after %d years would be %+,.2f",t,A);

        scanner.close();
    }
}
