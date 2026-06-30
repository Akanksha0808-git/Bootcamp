package StringFolder;
class Solution {
    public static void main(String[] args) {

        String s = "babad";
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                // Check if substring is palindrome
                int left = 0;
                int right = sub.length() - 1;
                boolean isPalindrome = true;

                while (left < right) {
                    if (sub.charAt(left) != sub.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPalindrome && sub.length() > ans.length()) {
                    ans = sub;
                }
            }
        }

        System.out.println("Longest Palindrome: " + ans);
    }
}