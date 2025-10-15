public class MoveNegatives {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};

//         Input:  [1, -2, 3, -4, 5, -6]
// Output: [-2, -4, -6, 1, 3, 5]  // negatives on the left

        moveNegativesToOneSide(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveNegativesToOneSide(int[] arr) {
        // Write your logic here
int start = 0;
int end = arr.length-1;
         for(int i = 0 ; i<arr.length;i++){
            if(arr[start]<0){
                start++;
            }else if(arr[end]>0){
                end--;

            }else if(arr[start]>=0 && arr[end]<0){
                swap(arr, start , end);
            }
          
         }
    }



    public static void swap(int [] arr, int start ,  int end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]= temp;
    }
}
