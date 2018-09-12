package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = scanner.next();

        if (isPalindrome(s))
            System.out.print("String is Palindrome!");
        else System.out.print("String not Palindrome!");

    }

    public static boolean isPalindrome(String s) {
        int length = s.length();
        int i = 0;
        int j = length - 1;

        if (length == 0 || length == 1) {
            return true;
        } else if (s.charAt(i) == s.charAt(length - 1)) {
            i++;
            String sub = s.substring(i, j);
            j--;
            return isPalindrome(sub);
        } else return false;
    }
}
