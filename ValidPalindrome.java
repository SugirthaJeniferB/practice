public class ValidPalindrome {
public boolean isPalindrome(String s) {
 int left = 0; 
 int right = s.length() - 1; 

 while (left < right) {
 
while (left < right && !isAlphanumeric(s.charAt(left))) {
 left++;
 }
 
 while (left < right && !isAlphanumeric(s.charAt(right))) {
 right--;
 }
 
 if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
 return false; 
} 
 left++;
 right--;
 }
 return true; 
 }

 
 private boolean isAlphanumeric(char c) {
 return Character.isLetterOrDigit(c);
 }

 public static void main(String[] args) {
 ValidPalindrome vp = new ValidPalindrome();
 String input = "A man, a plan, a canal: Panama";
 boolean result = vp.isPalindrome(input);
 System.out.println("Is the input a valid palindrome? " + result);
 }
}