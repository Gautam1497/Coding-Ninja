/*
Reverse String Word Wise

Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format
String in a single line
Output format
Word wise reversed string in a single line
Constraints
0 = S = 10^7
where S represents the length of string, S.
Sample Input 1
Welcome to Coding Ninjas
Sample Output 1
Ninjas Coding to Welcome
Sample Input 2
Always indent your code
Sample Output 2
code your indent Always
 */

import java.util.*;

public class L11_33_RSW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        System.out.println(check(s));
    }
    public static String check(String s)
    {
        int end=s.length();
        int i=end-1;
        StringBuilder o= new StringBuilder();
        while (i>=0)
        {
            if(s.charAt(i)==' ')
            {
                o.append(s, i + 1, end).append(" ");
                end=i;
            }
            i--;
        }
        o.append(s, i + 1, end).append(" ");
        return o.toString();
    }
}