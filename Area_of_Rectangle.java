import java.util.Scanner;

public class Area_of_Rectangle {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter length: ");
        int length=sc.nextInt();

        System.out.print("enter bredth: ");
        int breadth=sc.nextInt();

        int area=length*breadth;

        System.out.println("Area of Rectangle is: "+ area);

        sc.close();
    }
}

