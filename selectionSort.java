import java.util.Arrays;
public  class selectionSort {

    public static void main(String[] arr) {
        int[]  serviceTimes;
        serviceTimes = new int[] { 17,5,23,8,14,3,11,20,6,9};
        int n =serviceTimes.length;
        int comparisons = 0;
        int swaps = 0;

        System.out.println("intial array: " + Arrays.toString(serviceTimes));

        for (int i = 0; i < n - 1; i++) {
            int min = i; 

            for (int j = i + 1; j < n; j++){ 
                comparisons++;
                if (serviceTimes[j] < serviceTimes[min]) { 
                    min = j; 
                } 
            }

            if (serviceTimes[min] != i) {
                int temp = serviceTimes[i];
                serviceTimes[i]= serviceTimes[min];
                serviceTimes[min] = temp;
                swaps++;
            }            
            if(i < 3){
                System.out.print("After pass " + (i + 1) + ": " + Arrays.toString(serviceTimes));
                
                System.out.println();
            }   
        }
        System.out.println();
        System.out.println("Total comparisons " + comparisons + " ");
        System.out.println("Total swaps " + swaps);
         System.out.println("Final sorted array: " + Arrays.toString(serviceTimes));
    }
    
}
