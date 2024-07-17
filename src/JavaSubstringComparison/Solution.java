package JavaSubstringComparison;

public class Solution {
    public static void main(String[] args) {
        String str = "welcometojava";

        System.out.println(getSmallestAndLargest(str, 3));
    }

    public static String getSmallestAndLargest(String s, int k){
        String smallest ="", largest ="";

        for(int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, k + i);
            if (sub.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = sub;
            }

            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }
            return smallest + "\n" + largest;

    }
}
