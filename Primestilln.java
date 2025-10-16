public class Primestilln {
    public static void main(String[] args) {
        int n = 20;
        findPrimes(n);

    }

    public static void findPrimes(int n) {
  for(int i = 2;i<=n;i++){
    if(isPrime(i)){
        System.out.print(i + " "); 
    }
  }
    }


    public static  Boolean isPrime(int num){
        if(num<=1){
            for(int i = 2;i *i<=num;i++){
   if(num%i==0) return false;
            }
        }

        return true;
    }
    
}
