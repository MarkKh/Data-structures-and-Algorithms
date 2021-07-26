import java.util.*;
class selection {
    public static void main(String args[]) {
        int numArray[] = { 7, 5, 2, 20, 42, 15, 23, 34, 10 };
        System.out.println("Original Array:" + Arrays.toString(numArray));
        sel_sort(numArray);
        //System.out.println("Sorted Array:" + Arrays.toString(numArray));
    }
    
    static void sel_sort(int numArray[]) {
        int n = numArray.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (numArray[j] < numArray[min_idx])
                    min_idx = j;

            int temp = numArray[min_idx];
            numArray[min_idx] = numArray[i];
            numArray[i] = temp;
        printArray(numArray);
        }
    }

    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}