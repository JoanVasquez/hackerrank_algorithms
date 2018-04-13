import java.util.Scanner;

public class Tests {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String res = "NO";
        if(x1 < x2 && v1 > v2){
            res = ((x1-x2) % (v1-v2)) == 0? "YES" : "NO";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt(); // 0
        int v1 = in.nextInt(); // 3
        int x2 = in.nextInt(); // 4
        int v2 = in.nextInt(); // 2
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}