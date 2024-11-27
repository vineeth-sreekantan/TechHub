package com.workshop.stack.logical;

public class LogicalProgram {
    public static void main(String[] args) {
        isPalindrome("MALAYALAM");
        isPalindrome("TRIAL");
    }

    /**
     * To Check a String is Palindrome
     */
    private static void isPalindrome(String original) {
        String reverse = new StringBuilder(original).reverse().toString();
        if(original.equals(reverse)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(reverse + " is not a Palindrome");
        }
    }
}
