public class GCD {

    public static int gcd(int a, int b) {

        int r = a % b;

        while (r !=0) {
            r = a%b;
            a = b;
            b = r;
        }

        return a;
    }
}