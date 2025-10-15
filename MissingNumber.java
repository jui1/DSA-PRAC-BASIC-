public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5}; // numbers from 1 to n with one missing
        int missing = findMissingNumber(arr);
        System.out.println("Missing number is: " + missing);
    }

    public static int findMissingNumber(int[] arr) {
        
        int i = 0;
        while(i<arr.length){
            int current = arr[i]-1;
            // if( arr[i]<=arr.length && arr[i]  != arr[current]){
            //     swap(arr , i , current);
            // }
            if(arr[i] <= arr.length && arr[i] != arr[current]){
                swap(arr, i, current);
            }
            
            else{
                i++;
            }
        }

        for(int j = 1 ;j <arr.length;j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }
        

        
        return -1; 
    }


    public static void swap(int arr[] , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;

    }
}
