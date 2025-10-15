public class Kadanealgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);

        
    }
    public static int maxSubArraySum(int[] arr) {

        int maxsofar = arr[0];
        int maxhere = arr[0];

        for(int i = 1;i< arr.length;i++){
            maxhere = Math.max(arr[i] , maxhere+arr[i]);
            maxsofar = Math.max(maxhere, maxsofar);
        }

return maxsofar;
    }
    
}
