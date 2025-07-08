import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args){
        //NESTED LOOP

        Scanner scanner=new Scanner(System.in);

        int rows;
        int columns;

        System.out.print("enter the no. of rows: ");
        rows=scanner.nextInt();

        System.out.print("enter the no. of columns: ");
        columns=scanner.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
