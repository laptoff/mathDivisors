public class GCD {

    public static int gcd(int a, int b) {
        /*
         * Euclide Algorithm --> https://fr.wikipedia.org/wiki/Algorithme_d%27Euclide
         */

        int r = a % b;

        while (r !=0) {
            r = a%b;
            a = b;
            b = r;
        }

        return a;
    }
}