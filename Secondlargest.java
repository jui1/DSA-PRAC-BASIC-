public class Secondlargest {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};

        // call your logic method here
          int secondLargest = findSecondLargest(arr);
          System.out.println("Second Largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
         // Write your logic here

         int max = arr[0];
         int sec = Integer.MIN_VALUE; 
        //  int seconmax = Integer.MIN_VALUE;

         for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
               sec = max;
               max = arr[i];

                 

            }else if ( arr[i]>sec  && arr[i] != max){ 
              
                sec=arr[i];
            }

     


            
         }



return sec;




    
    }
}
