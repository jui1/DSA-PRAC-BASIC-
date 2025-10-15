import java.util.HashSet;

public class Subarraysumzero {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6 , 9 };

        boolean exists = hasZeroSumSubarray(arr);
        if(exists) {
            System.out.println("Subarray with sum 0 exists");
        } else {
            System.out.println("No subarray with sum 0");
        }
    }


    public static boolean hasZeroSumSubarray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int cb : arr){
            sum+=cb;

            if(sum==0 || set.contains(sum)){
                return true;
            }



            set.add(sum);
        }



return false;


    }
}
