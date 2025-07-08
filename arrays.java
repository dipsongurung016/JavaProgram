import java.util.Arrays;

public class arrays {
    public static void main(String[] args){

        String[] games={"football","volleyball","basketball","cricket"};

        // games[0]="baseball";

        //Arrays.fill(games,"banana");

        Arrays.sort(games);

        for(String game : games) {
            System.out.print(game+" ");
        }
    }
}
