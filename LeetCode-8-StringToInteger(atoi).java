class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int n = s.length();
        long result = 0;
        while (i < n && s.charAt(i) == ' ')
            i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            if (sign * result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if (sign * result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            i++;
        }
        return (int) (sign * result);
    }
}