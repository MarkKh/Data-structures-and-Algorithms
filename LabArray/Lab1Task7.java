import java.util.*;
public class Lab1Task7 {
    public static void main(String[] args) {
        int arr[] = getData(10);
        max(arr);
        System.out.println(printArr(arr));
        System.out.println("Max = " + max(arr));
    }

    static int max(int[] a) {
        int max = a[0];
        for (int j = 0; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            }
        }
        return max;
    }

    private static String printArr(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        return result;
    }

    private static int[] getData(int m) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

}
