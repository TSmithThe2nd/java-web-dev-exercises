package conceptTester;
import java.util.HashMap;
import java.util.Map;

public class tester {
    public static void main(String[] args){
        HashMap<String, Integer> playerNumber= new HashMap<>();

        playerNumber.put("newton",1);
        playerNumber.put("Culton", 8);
        playerNumber.put("Kelley", 18);

        System.out.println(playerNumber);
    }
}
