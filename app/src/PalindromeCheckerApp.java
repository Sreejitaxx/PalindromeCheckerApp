import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

                String input = "radar";
                char[] charArray = input.toCharArray();
                int left = 0;
                int right = charArray.length - 1;
                boolean isPalindrome = true;
                while (left < right) {
                    if (charArray[left] != charArray[right]) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                System.out.println("input: " + input);
                System.out.println("is palindrome?: " + isPalindrome);
            }
        }
