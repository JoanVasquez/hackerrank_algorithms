import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        int []arr = new int [n];
        
        for(int a:ar){
            arr[a]++;
        }
        
        int maxValue = 0; 
        int maxPos=0;
    
        for(int i = 1; i < n; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
                maxPos =  i;
            }     
        }
        return maxPos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}