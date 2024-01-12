import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer une valeur: ");
        int x = scanner.nextInt();

        for (int n : Divisors.divisors(x)) {
            System.out.println(n);
        }

        System.out.println("Veuillez entrer deux valeurs pour le PGCD: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.close();

        System.out.println("Le PGCD est de: " + GCD.gcd(n1, n2));
        
    }
}
