public class allelemnt {
    public static void main(String[] args) {
    
        int[] arr = {25, 11, 7, 75, 56};

        int[] result = findMinMaxSecondLargest(arr);
        System.out.println("Largest number is: " + result[0]);
        System.out.println("Second Largest number is: " + result[1]);
        System.out.println("Smallest number is: " + result[2]);
    }
    public static int[] findMinMaxSecondLargest(int[] arr) {

        int max = arr[0];
        int sec = Integer.MIN_VALUE;
        int small = arr[0];

        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                sec =max;
                max = arr[i];
            }else if(arr[i]<small){
                small = arr[i];
            }else if(arr[i] > sec && arr[i] != max){
                sec= arr[i];
            }
        }

        return new int[]{max, sec, small};

    }



}
