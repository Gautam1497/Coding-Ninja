/*
Remove X

Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S
Output format :
Modified String
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S.
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:
 */

import java.util.Scanner;

public class AS15Q02_Removex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(remove(s));
    }
    public static String remove(String s){
        int n=s.length();
        if(n<1)return "";
        if(s.charAt(0)=='x')return remove(s.substring(1));
        return s.charAt(0)+remove(s.substring(1));
    }
}

