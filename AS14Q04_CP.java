/*
Check Palindrome (recursive)

Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false
 */

import java.util.Scanner;

public class AS14Q04_CP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(check(s));
    }
    public static boolean check(String s){
        if(s.length()<=1)return true;
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return check(s.substring(1,s.length()-1));
        }
        else return false;
    }
}
