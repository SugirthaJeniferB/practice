import java.util.HashSet;
public class LongestSubstring {
 public static int lengthOfLongestSubstring(String s) {
 HashSet<Character> set = new HashSet<>();
 int left = 0, maxLength = 0;
 for (int right = 0; right < s.length(); right++) {
 while (set.contains(s.charAt(right))) {
 set.remove(s.charAt(left));
 left++;
 }
 set.add(s.charAt(right));
 maxLength = Math.max(maxLength, right - left + 1);
 }
 return maxLength;
 }
 public static void main(String[] args) {
 String s = "bcbcaaabc";
 System.out.println("Length of the longest substring without repeating characters: " + 
lengthOfLongestSubstring(s));
 }
}