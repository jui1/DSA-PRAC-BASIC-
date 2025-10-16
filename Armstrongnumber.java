import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int n) {
        int orginal = n;
        int sum = 0;
        int dights = String.valueOf(n).length();

        while(n>0){
            int  dight = n%10;
            sum+=Math.pow(dight, dights);
            n/=10;

        }


        return sum ==orginal;





    }

    
}
