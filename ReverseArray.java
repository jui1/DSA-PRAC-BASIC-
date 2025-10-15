public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr);

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr , start , end);
            start++;
            end--;
        }
} 


public static void swap(int[] arr , int s, int e){
    int temp = arr[s];
    arr[s]= arr[e];
    arr[e] = temp ;
}
}
