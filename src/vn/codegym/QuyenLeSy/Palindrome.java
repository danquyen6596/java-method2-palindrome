package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        isPalindrome(s);

    }

    public static boolean isPalindrome(String s){
        int length = s.length();

        if (s.charAt(1) == s.charAt(length)){
            System.out.println("Bằng");
        }
    }
}
