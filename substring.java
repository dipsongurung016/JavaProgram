import java.util.Scanner;

public class substring {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("entre your email: ");
        email=scanner.nextLine();

        username = email.substring(0,email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1);

        System.out.println("username= "+ username);
        System.out.println("domain= "+ domain);
        scanner.close();
    }
}
//  .substring()= A method used to extract a portion of a string
//                .substring(strat, end(exclusive) );