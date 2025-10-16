public class GCD_LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
    public static int findGCD(int a, int b) {
        if (b==0) return a;
        return findGCD(b , a%b);


    }

    public static int findLCM(int a, int b, int gcd) {

        return (a*b)/gcd;
    }

    
}
