import java.util.*;
public class Lab1Task6 {
    public static void main(String[] args) {
        int arr[] = getData(10);
        Arrays.sort(arr);
        System.out.println(printArr(arr));
        System.out.print(Arrays.toString(arr));
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
