import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer une valeur: ");
        int x = scanner.nextInt();
        scanner.close();

        for (int n : Divisors.divisors(x)) {
            System.out.println(n);
        }
        
    }
}
