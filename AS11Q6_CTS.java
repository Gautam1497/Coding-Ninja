/*
Compress the String

Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
Exmple:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.
Note :
Consecutive count of every character in the input string is less than or equal to 9.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa
Sample Input 2:
aaabbcddeeeee
Sample Output 2:
a3b2cd2e5
 */

import java.util.Scanner;

public class AS11Q6_CTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.next();
        System.out.println(compress(s));
    }
    public static String compress(String s)
    {
        int l=s.length();
        StringBuilder a= new StringBuilder();
        if(l==0)return a.toString();
        int cc=1;
        a.append(s.charAt(0));
        for (int i=1;i<l;++i)
        {
            if(s.charAt(i)==s.charAt(i-1))++cc;
            else {
                if(cc>1)
                {
                    a.append(cc);
                    cc=1;
                }
                a.append(s.charAt(i));
            }
        }
        if (cc>1) a.append(cc);
        return a.toString();
    }
}