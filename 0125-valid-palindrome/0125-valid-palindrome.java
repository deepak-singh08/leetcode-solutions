class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters from left
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from right
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare both characters
            else {
                if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}