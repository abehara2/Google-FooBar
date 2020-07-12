public class Solution {
    public static int solution(int start, int length) {
        int checksum = -1;
        int counter = length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j < counter) {
                    if (checksum == -1) {
                        checksum = start;
                    } else {
                        checksum = checksum^start;
                    }
                }
                start++;
            }
            counter --;
        }
        return checksum;
    }
}