import java.util.ArrayList;
import java.util.List;

public class Divisors {

    private static final List<Integer> divisorsList = new ArrayList<Integer>();

    public static List<Integer> divisors(Integer n){
            
        for (int i = n-2*n; i <= n; i++) {
            for (int j = n-2*n; j <= n; j++) {
                if (i*j == n) {
                    divisorsList.add(i);
                }
            }
        }
        return divisorsList;

    }
}
