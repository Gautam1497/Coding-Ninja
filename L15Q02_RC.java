/*
Replace Character Recursively

Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Output Format :
Updated string
Constraints :
1 <= Length of String S <= 10^6
Sample Input :
abacd
a x
Sample Output :
xbxcd
 */

import java.util.*;

public class L15Q02_RC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String c1 = sc.next();
        String c2 = sc.next();
        System.out.println(check(s, c1, c2));
    }
    public static String check(String s,String c1,String c2){
        if(s.isEmpty())return s;
        String str="";
        if(s.charAt(0)==c1.charAt(0))str=str+c2;
        else str=str+s.charAt(0);
        return str+check(s.substring(1),c1,c2);
    }
}
