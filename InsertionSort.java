public class InsertionSort{
    public static void main(String[] args){
        int[] serviceTimes = {17, 5, 23, 8, 14, 3, 11, 20,6,9};
        int comparisons = 0 ;
        int shifts = 0;
        int n = serviceTimes.length;
        System.out.println("Initial array: " + java.util.Arrays.toString(serviceTimes));

        for (int i = 1; i < n; i++){
            int temp = serviceTimes[i];
            int j = i - 1;

            while (j >= 0 ){
                comparisons = comparisons +1;
                if (serviceTimes[j] > temp){
                    serviceTimes[j + 1] = serviceTimes[j];
                    shifts = shifts + 1;
                    j = j - 1;
                } else{
                    break;
                }
            }
            serviceTimes[j + 1] = temp;
            if (i <= 3){
                System.out.println("Pass" + i + " State: " + java.util.Arrays.toString(serviceTimes));
            }
        }
        System.out.println();
        System.out.println("Sorted array: " + java.util.Arrays.toString(serviceTimes));
        System.out.println("Total data-value comparisons: " + comparisons);
        System.out.println("Total element shifts: " + shifts);
    }   

}
    

