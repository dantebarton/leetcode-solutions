/* Problem: Palindrome ; Difficulty: easy
* Given an integer x, return true if x is a palindrome, and false otherwise.

* Example 1:
* Input: x = 121
* Output: true
* Explanation: 121 reads as 121 from left to right and from right to left.
*/

public class Palindrome {
    public boolean isPalindrome(int x) {
        int reverse = 0; // int variable used to store the reverse of the input
        int remainder = 0; // int variable used to reverse the input 
        int v = x; // temp int variable for integer manipulation

        // If the input is less than 0 then we automatically return false because 
        // this doesn't satisfy the given parameters of the problem.
        if (v < 0) {
            return false;
        }
        
        while (v > 0) { // Iterate over the entire number until fully reversed
            remainder = v%10; // capture the last digit from the current value of v
            reverse = reverse * 10 + remainder; // store the number and begin building the reverse value
            v = v / 10; // shrink the value of v as we process each digit
        }

        if (reverse == x) {
            return true; // return true if the condition holds and the input is a Palindrome
        } else {
            return false; // return false if the conditions fails and the input isn't a Palindrome
        }
    }
}
