import java.util.ArrayList;
import java.util.List;

public class Divisors {

    private static final List<Integer> divisorsList = new ArrayList<Integer>();

    public static List<Integer> divisors(Integer n){
            
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i*j == n) {
                    divisorsList.add(i);
                }
            }
        }
        return divisorsList;

    }
}
