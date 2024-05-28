/*
Pair star

Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a
 */

import java.util.Scanner;

public class AS15Q04_PairStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(convert(s));
    }
    public static String convert(String s){
        int n=s.length();
        if(n<=1)return s;
        String temp=convert(s.substring(1));
        if(s.charAt(0)==s.charAt(1)){
            temp=s.charAt(0)+"*"+s.charAt(1)+temp.substring(1);
        }
        else temp=s.charAt(0)+temp;
        return temp;
    }
}
