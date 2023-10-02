class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int)(temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}

/*   
 The isPalindrome method first checks if the input integer x is negative. 
 If x is negative, it immediately returns false because negative numbers can't be palindromes.

 It then declares two long variables, reversed and temp, both initialized to 0 and assigned the value of x, respectively.
 Inside a while loop, the code reverses the digits of the number x by repeatedly extracting the last digit of temp using the modulo operator (%) 
 and appending it to the reversed variable, effectively reversing the number.

 After extracting and reversing all the digits, it checks if the reversed number equals the original number x. 
 If they are equal, it returns true, indicating that x is a palindrome; otherwise, it returns false.
 */
