public class Solution {
    public static int[] solution(int[] l, int t) {
        int[] arr = new int[2];
        for (int i = 0; i < l.length - 1; i++) {
            int sum = l[i];
            if (sum == t) {
                arr[0] = i;
                arr[1] = i;
                return arr;
            }
            for (int j = i + 1; j < l.length; j++) {
                sum += l[j];
                if (sum == t) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        int length = l.length - 1;
        if (l[length] == t) {
            arr[0] = length;
            arr[1] = length;
        } else {
            arr[0] = -1;
            arr[1] = -1;
            
        }
        return arr;
    }
}