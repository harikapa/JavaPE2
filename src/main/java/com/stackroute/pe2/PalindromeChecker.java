package com.stackroute.pe2;

//Write a Java method to Reverse the given input & Check if it is a Palindrome.

public class PalindromeChecker {

    public PalindromeChecker()
    {

    }

    public boolean isPalindrome(String word)
    {
        try {

            if(word == null)
            {
                return false;
            }

            StringBuilder reverse = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {

                reverse.append(word.charAt(i));
            }

            return word.contentEquals(reverse);
        }

        catch (Exception exception)
        {
            return false;
        }
    }
}
