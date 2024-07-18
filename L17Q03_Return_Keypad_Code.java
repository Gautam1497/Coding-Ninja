/*
Return Keypad Code

Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
 */

import java.util.ArrayList;
import java.util.Scanner;

public class L17Q03_Return_Keypad_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<String> str=check(a);
        for(String st:str) System.out.println(st);
    }
    //check will convert int to string and call combine and finally return the value returned by combine
    public static ArrayList<String> check(int a){
        String str=Integer.toString(a);
        return combine(str);
    }
    //combine will take input as string and recursively find all combination
    public static ArrayList<String> combine(String s) {
        ArrayList<String>r=new ArrayList<>();
        if(s.isEmpty()) {
            r.add("");
            return r;
        }
        String first=code(s.charAt(0));//this will contain string value of first digit
        ArrayList<String > str=combine(s.substring(1));//recursively store
        for(char ch:first.toCharArray()){
            for (String st:str){
                r.add(ch+st);
            }
        }
        return r;
    }

    public static String code(char ch){
        if( ch=='0' || ch==1)return "+";
        else if( ch=='2')return "abc";
        else if( ch=='3')return "def";
        else if( ch=='4')return "ghi";
        else if( ch=='5')return "jkl";
        else if( ch=='6')return "mno";
        else if( ch=='7')return "pqrs";
        else if( ch=='8')return "tuv";
        else if( ch=='9')return "wxyz";
        else return "";
    }
}
