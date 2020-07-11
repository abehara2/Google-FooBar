public class Solution {
    public static int solution(String s) {
        ArrayList<Integer> factors = new ArrayList<>();
        int length = s.length();
        for (int i = 1; i <= length; i++) {
            if (length % i == 0) {
                factors.add(i);
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (Integer factor : factors) {
            int index = 0;
            String previous = null;
            while (index <= s.length() - factor) {
                String substring = s.substring(index, index + factor);
                if (previous == null) {
                    previous = substring;
                } else {
                    if (!previous.equals(substring)) {
                        break;
                    }
                }
                Integer value = map.get(substring);
                if (value == null) {
                    value = 1;
                } else {
                    value ++;
                }
                map.put(substring,value);
                index += factor;
            }
        }
        Integer max_parts = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key + ": "  + value);
            if (value * key.length() == length && value > max_parts) {
                max_parts = value;
            }
        }
        return max_parts;
    }
}