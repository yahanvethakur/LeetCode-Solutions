/*
Problem: Plindrome Number
LeetCode: Nine
Difficulty: Easy
Language: Java
*/

class PalindromeNumber{
    public boolean isPalindrome(int x) {
     if (x<0){
     return false;
    }
    int originalNumber=x;
    int reversedNumber=0;

    while(x>0){
        int lastdigit=x%10;
        reversedNumber = reversedNumber * 10 + lastdigit;
        x=x/10;
    }
    return originalNumber == reversedNumber;
}
}