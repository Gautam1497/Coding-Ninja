/*
Remove Duplicates Recursively

Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
 */

import java.util.Scanner;

public class L15Q03_RDR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(check(s));
    }
    public static String check(String s){
        if(s.length()<=1)return s;
        if(s.charAt(0)!=s.charAt(1)) {
            String str = check(s.substring(1));
            return s.charAt(0) + str;
        }
        else return check(s.substring(1));
    }
}
