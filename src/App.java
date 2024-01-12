import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value: ");
        int x = scanner.nextInt();

        for (int n : Divisors.divisors(x)) {
            System.out.println(n);
        }

        System.out.println("Please enter two values: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.close();

        System.out.println("The gcd is: " + GCD.gcd(n1, n2));
        
    }
}
