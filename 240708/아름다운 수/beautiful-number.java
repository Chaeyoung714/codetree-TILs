import java.util.Scanner;

public class Main {
    public static int n;
    public static int totalCnt = 0;
    public static int[] result;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        result = new int[n];

        beautifulNumber(0, 0, 0);

        System.out.println(totalCnt);

    }

    public static void beautifulNumber(int depth, int lastVal, int cnt) {
        if (depth > n-1) {
            if (lastVal == cnt) { //숫자 한묶음이 완성되었는지
                totalCnt ++;
            }
            return;
        }

        // if (val == result[depth-1]) { 
        if (cnt < lastVal) { //한묶음 완성이 안됐으면
            result[depth] = lastVal;
            beautifulNumber(depth+1, lastVal, cnt+1);
        } else if (cnt == lastVal) { //한묶음 완성이 됐으면
            for (int newVal=1; newVal<=4; newVal++) {
                result[depth] = newVal;
                beautifulNumber(depth+1, newVal, 1);

            }
        }

    }
}