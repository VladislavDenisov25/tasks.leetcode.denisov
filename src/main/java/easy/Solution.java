package easy;

import easy.merge.two.sorted.lists.ListNode;
import easy.merge.two.sorted.lists.MergeTwoSortedLists;

public class Solution {
    public static void main(String[] args) {
//        PalindromeNumber palindromeNumber = new PalindromeNumber();
//        System.out.println(palindromeNumber.isPalindrome(12321));
//        RomanToInteger romanToInteger = new RomanToInteger();
//        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
//        ValidParentheses validParentheses = new ValidParentheses();
//        System.out.println(validParentheses.isValid("()[]{}"));
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        System.out.println(mergeTwoSortedLists.mergeTwoLists(
                (new ListNode(1, new ListNode(2, new ListNode(4)))),
                (new ListNode(1, new ListNode(3, new ListNode(4))))));
    }
}


