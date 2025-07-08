import java.util.Random;

public class justRandom {
    public static void main(String[] args){

        Random random=new Random();

      int num=random.nextInt(1,7);
        System.out.println(num);
    }
}