import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; //SUM ELEMENTS OF THE ARRAY
        }
        System.out.println((sum - arr[arr.length-1]) + " " + (sum - arr[0])); // CALCULATE THE SUM OF MAX - MIN
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr); // SORTING FROM MIN TO MAX IN ORDER THAT WE KNOW THE MIN AND MAX IN THE ARRAY
        miniMaxSum(arr);
        in.close();
    }

}