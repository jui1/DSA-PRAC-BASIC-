import java.util.Arrays;

public class Mergesortedarrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 0, 0, 0};  // extra space
        int[] arr2 = {2, 4, 6};
        int n = 3; // number of valid elements in arr1
        int m = arr2.length;

        mergeInPlace(arr1, n, arr2, m);

        System.out.println("Merged In-place: " + Arrays.toString(arr1));
    }

    public static void mergeInPlace(int[] arr1, int n, int[] arr2, int m) {
       int i = n-1;
       int j = m-1;
       int k=  m+n-1;

       while(i>=0 && j>=0){
        if(arr1[i] >arr1[j]){
            arr1[k--]= arr1[i--];
        }else{
            arr1[k--] = arr1[j--];
        }
        
       }
       while(j>=0){
        arr1[k--] = arr2[j--];
       }



    }
    
}
