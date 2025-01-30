import java.util.HashMap;
public class MinWindowSubstring {
 public static String minWindow(String s, String t) {
 if (t.length() > s.length()) return "";
 HashMap<Character, Integer> tCount = new HashMap<>();
 for (char c : t.toCharArray()) {
 tCount.put(c, tCount.getOrDefault(c, 0) + 1);
 }
 int required = tCount.size();
 int left = 0, right = 0, formed = 0;
 HashMap<Character, Integer> windowCounts = new HashMap<>();
 int[] ans = {-1, 0, 0}; // length, left, right
 while (right < s.length()) {
 char c = s.charAt(right);
 windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);
 if (tCount.containsKey(c) && windowCounts.get(c).intValue() == tCount.get(c).intValue()) {
 formed++;
 }
 while (left <= right && formed == required) {
 c = s.charAt(left);
 if (ans[0] == -1 || right - left + 1 < ans[0]) {
 ans[0] = right - left + 1;
 ans[1] = left;
 ans[2] = right;
 }
 windowCounts.put(c, windowCounts.get(c) - 1);
 if (tCount.containsKey(c) && windowCounts.get(c).intValue() < tCount.get(c).intValue()) {
 formed--;
 }
 left++;
 }
 right++;
 }
 return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
 }
 public static void main(String[] args) {
 String s = "ADOBECODEBANC";
 String t = "ABC";
 System.out.println("Minimum window substring: " + minWindow(s, t));
 }
}