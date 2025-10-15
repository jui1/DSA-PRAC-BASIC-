public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        String direction = "left"; 

        rotateArray(arr, k, direction);

        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] arr, int k, String direction) {
        // Write your logic here
        k= k%arr.length;
        if(direction.equals("left")){
            
         reverse(arr, 0, k-1);
         reverse(arr, k, arr.length-1);
         reverse(arr, 0, arr.length-1);


        }
        if(direction.equals("right")){
            
            reverse(arr, arr.length-k, arr.length-1);
            reverse(arr, 0, arr.length-k-1);
            reverse(arr, 0, arr.length-1);
   
   
           }
        


    }

    public static void reverse(int[] arr , int start , int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
    }
}
