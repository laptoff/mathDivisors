import java.util.ArrayList;
import java.util.List;

public class Divisors {
    /*
     * LES DIVISEURS GRACE AUX LISTES
     * 
     * 
     */

    private static final List<Integer> divisorsList = new ArrayList<Integer>();

    public static List<Integer> divisors(Integer n){
        
            
        for (int i = n*-1; i <= n; i++) {
            for (int j = n*-1; j <= n; j++) {
                if (i*j == n) {
                    divisorsList.add(i);
                }
            }
        }
        return divisorsList;

    }
}
