import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;

        findPairs(arr, targetSum);
    }

    public static void findPairs(int[] arr, int targetSum) {
        // Step 1: Loop through all pairs
    //    for(int i = 0 ; i< arr.length-1;i++){
    //    for(int j = i+1; j<arr.length;j++){

    //     if(arr[i]+arr[j] == targetSum){
    //         System.out.println("(" + arr[i] + ", " + arr[j] + ")");
    //     }

    //   }

    //    }

    HashMap<Integer, Integer> store = new HashMap<>();

    for(int sh : arr){
        store.put(sh, store.getOrDefault(sh, 0) + 1);
    }

    for(int i = 0 ;i <arr.length;i++){
       int val = targetSum- arr[i];
       if(store.containsKey(val)){
        System.out.println("(" + arr[i] + ", " + val + ")");

       }
    }
   
    }
}
