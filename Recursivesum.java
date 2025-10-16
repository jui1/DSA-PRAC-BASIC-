import java.util.Scanner;

public class Recursivesum {
    
    public static int f(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return  f(n-1)+f(n-2);

    }
  



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci sequence up to " + n + "th term:");
        for (int i = 0; i < n; i++) {
            System.out.print(f(i) + " ");
        }
    }

}

