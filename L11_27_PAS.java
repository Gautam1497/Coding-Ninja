/*
Print All Substrings

For a given input string(str), write a function to print all the possible substrings.
Substring
A substring is a contiguous sequence of characters within a string.
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
Print the total number of substrings possible, where every substring is printed on a single line and hence the total number of output lines will be equal to the total number of substrings.
Note:
The order in which the substrings are printed, does not matter.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abc
Sample Output 1:
a
ab
abc
b
bc
c
 Sample Input 2:
co
Sample Output 2:
c
co
o
 */

import java.util.Scanner;

public class L11_27_PAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        check(s);

    }
    public static void check(String s)
    {
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            for (int j=i+1;j<l+1;j++)
            {
                System.out.println(s.substring(i,j));
            }
        }
    }
}