public class Lab1Task3 {
    private static int j;
    public static void main(String[] args) {
         int arr[] = {2,4,5,87,15,24,32};
         
         System.out.println(printArr(arr));
         
    }
    private static String printArr(int[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i]+" ";
        }
        return result;
    }
 
 }
 