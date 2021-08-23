package strings.task_palindrome;

/**
 * Given a string.
 * Return true, if a given string is a palindrome.
 *
 * "racecar" => true ,
 * "hello" => false
 * */

public class Palindrome {

    public boolean isPalindrome(String str) {
        char[] stringCharacters = str.toCharArray();
        int start = 0;
        int end = stringCharacters.length;

        while (start < end)
            if (stringCharacters[start]  != stringCharacters[end - 1] ) {
                return false;
            } else  {
                start +=1;
                end -=1;
            }
        return true;
    }
}
