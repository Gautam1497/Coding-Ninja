/*
Reverse Each Word

Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
Output Format:
The only line of output prints the sentence(string) such that each word in the sentence is reversed.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
 */

import java.util.*;

public class AS11Q3_REW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        int l=s.length();
        int a=0;
        for (int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ') {
                StringBuilder r=reverse(s.substring(a, i));
                System.out.print(r+" ");
                a=i+1;
            }
        }
        System.out.println(reverse(s.substring(a,l)));

    }
    public static StringBuilder reverse(String s)
    {
        int l=s.length();
        StringBuilder str=new StringBuilder(s);
        for (int i=l-1;i>=0;i--)
        {
            str.deleteCharAt(i);
            str.append(s.charAt(i));
        }
        return str;
    }
}