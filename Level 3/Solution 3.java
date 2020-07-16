public class Solution {
    public static int solution(int[] l) {
        int[] arr = new int[l.length];
        int triples = 0;
        for (int i = 0; i < l.length - 1; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[j] % l[i] == 0) {
                    arr[j] += 1;
                    triples += arr[i];
                }

            }
        }
        return triples;
    }
}