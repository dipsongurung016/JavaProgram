public class printf_statement {
    public static void main(String[] args){
        int age=20;
        double amount=2000000.99;
        char currency='$';
        String name="Dipson Gurung";
        boolean value=true;

        System.out.printf("name is %s\n",name);
        System.out.printf("age is %+d\n",age);
        System.out.printf("the amount is %c%,.2f\n",currency,amount);
        System.out.printf("the value is %b\n\n",value);

        double a=200000.20000;
        double b=-300000.20000;

        System.out.printf("% .2f\n",a);
        System.out.printf("% .2f",b);
    }
}
