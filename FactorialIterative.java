import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial = 1;

        // Write your logic here
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        sc.close();
    }
}
