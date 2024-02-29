/*
Remove Consecutive Duplicates

For a given string(str), remove all the consecutive duplicate characters.
Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx
 */

import java.util.*;

public class AS11Q2_RCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        System.out.println(check(s));

    }
    public static StringBuilder check(String s)
    {
        int l=s.length();
        StringBuilder str= new StringBuilder(s);
        for (int i=0;i<l-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1)) {
                str.delete(i + 1, i + 2);
                i--;
                l--;
            }
        }
        return str;
    }
}