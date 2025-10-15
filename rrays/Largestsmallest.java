package rrays;

public class Largestsmallest {
    public static void main(String[] args) {

      


int[] arr = {25, 11, 7, 75, 56};

int[] result = findMinMax(arr);
System.out.println("Largest number is: " + result[1]);
System.out.println("Smallest number is: " + result[0]);

    }

    public static int[] findMinMax(int [] arr){
        int max = arr[0];
        int min = arr[0];

        for(int i = 0 ; i<arr.length-1;i++){
            if(arr[i]> max){
                
               max = arr[i];
            }
            else if(arr[i]<min){
               
                   min= arr[i];
                
            } 
        }


        return new int[]{min, max};


    }
    
    

    
}
