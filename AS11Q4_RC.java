/*
Remove character

For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
Input Format:
The first line of input contains a string without any leading and trailing spaces.

The second line of input contains a character(X) without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
a
Sample Output 1:
bccb
Sample Input 2:
xxyyzxx
y
Sample Output 2:
xxzxx
 */

import java.util.*;

public class AS11Q4_RC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        System.out.println("Enter character to remove");
        char c=sc.next().charAt(0);
        System.out.println(remove(s,c));
    }
    public static StringBuilder remove(String s, char c)
    {
        int l=s.length();
        StringBuilder str=new StringBuilder(s);
        for (int i=0;i<l;i++)
        {
            if(str.charAt(i)==c) {
                str.deleteCharAt(i);
                i--;
                l--;
            }
        }
        return str;
    }
}