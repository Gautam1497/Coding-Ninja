/*
String to Integer

Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")
Output format :
Corresponding integer N (int, Eg. 1234)
Constraints :
0 <= |S| <= 9
where |S| represents length of string S.
Sample Input 1 :
1231
Sample Output 1 :
1231
Sample Input 2 :
12567
Sample Output 2 :
12567
 */

import java.util.Scanner;

public class AS15Q03_StringToInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(convert(s));
    }
    public static int convert(String s){
        int n=s.length();
        if(n==1)return s.charAt(0)-'0';
        int a=convert(s.substring(0,n-1));
        int b=s.charAt(n-1)-'0';
        return a*10+b;
    }
}
