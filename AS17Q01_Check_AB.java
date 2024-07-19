/*
Check AB

Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.
Input format :
String S
Output format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
abb
Sample Output 1 :
true
Sample Input 2 :
abababa
Sample Output 2 :
false
 */

import java.util.Scanner;

public class AS17Q01_Check_AB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(check(s));
    }
    public static boolean check(String s){
        if(s.isEmpty()){
            return true;
        }
        if(s.charAt(0)=='a') {
            if(s.substring(1).length()>1 && s.startsWith("bb"))return check(s.substring(2));
            else return check(s.substring(1));
        }
        return false;
    }
}
