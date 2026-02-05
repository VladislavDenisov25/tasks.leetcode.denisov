package palindrome.number;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        // отрицательные и числа, оканчивающиеся на 0 (кроме 0) — не палиндромы
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        // чётная длина: x == reversedHalf
        // нечётная длина: x == reversedHalf / 10
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
