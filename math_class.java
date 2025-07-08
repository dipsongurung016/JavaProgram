import java.util.Scanner;

public class math_class {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

    //program to find the hypotenious of a Right angled Triangle
        double  p,b,h;

        System.out.print("Enter the value of p: ");
        p=scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        b=scanner.nextDouble();

        h=Math.sqrt(Math.pow(p,2)+Math.pow(b,2));

        System.out.println("h= "+ h+ " cm");

        scanner.close();
    }
}

// numlock on + alt + 0178 = ² (square)
