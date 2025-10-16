import java.util.*;


public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;


        while(num>0){
            int dight =num%10;
            reversed= reversed*10+ dight ;
            num/=10;

        }
        
        // Your logic to reverse the number
        

        System.out.println("Reversed number: " + reversed);
    }

}