import java.lang.Math;
public class Solution {
    public static int solution(int total_lambs) {
         if (total_lambs == 1) {
            return 0;
        }
        if (total_lambs == 2) {
            return 1;
        }
        int generous = 1;
        int stingy = 0;
        int sum = 0;
        while (sum <= total_lambs) {
            sum += Math.pow(2,generous - 1);
            if (sum + Math.pow(2,generous) <= total_lambs) {
                generous ++;
            }
        }

        //fibonacci
        int fib = 0;
        int first = 0;
        int second = 1;
        int total_sum = first + second;
        while (total_sum <= total_lambs) {
            fib = first + second;
            first = second;
            second = fib;
            total_sum += second;
            stingy++;


        }
        return stingy - generous;
    }
}