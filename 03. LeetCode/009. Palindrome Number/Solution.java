class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }
}