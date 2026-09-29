public class MergeSortDemo {

    static int[] newArray;

    public static void mergeSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    public static void merge(int[] arr, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;

        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                newArray[k] = arr[i];
                i = i + 1;
            } else {
                newArray[k] = arr[j];
                j = j + 1;
            }
            k = k + 1;
        }

        if (i > mid) {
            while (j <= ub) {
                newArray[k] = arr[j];
                j = j + 1;
                k = k + 1;
            }
        } else {
            while (i <= mid) {
                newArray[k] = arr[i];
                i = i + 1;
                k = k + 1;
            }
        }

        for (k = lb; k <= ub; k++) {
            arr[k] = newArray[k];
        }
    }

    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        int[] array = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};
        newArray = new int[array.length];
        int lb = 0;
        int ub = array.length - 1;

        System.out.print("Original array: ");
        printArray(array);

        mergeSort(array, lb, ub);

        System.out.print("Sorted array:   ");
        printArray(array);
    }
}