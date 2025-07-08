import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) throws InterruptedException {

        //for loop = execute some code a CERTAIN amount of times

        Scanner scanner=new Scanner(System.in);
        int count=0;

        System.out.print("enter the countdown:");
        count=scanner.nextInt();

        for(int i=count;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year 🥳🥂");
    }
}
