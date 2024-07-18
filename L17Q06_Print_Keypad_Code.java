/*
Print Keypad Combinations Code

Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
Note : The order of strings are not important. Just print different strings in new lines.
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

public class L17Q06_Print_Keypad_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        combine(a);
    }
     public static void combine(int a){
        combine(a,"");
    }
   public static void combine(int a,String s) {
        if(a==0 || a==1){
            System.out.println(s);
            return;
        }
        String str=code(a%10);
        ArrayList<String> st=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            st.add(Character.toString(str.charAt(i)));
        }
        for(int i=0;i<str.length();i++){
            combine(a/10,st.get(i)+s);
        }
    }

    public static String code(int n){
        if( n==0 || n==1)return "+";
        else if( n==2)return "abc";
        else if( n==3)return "def";
        else if( n==4)return "ghi";
        else if( n==5)return "jkl";
        else if( n==6)return "mno";
        else if( n==7)return "pqrs";
        else if( n==8)return "tuv";
        else if( n==9)return "wxyz";
        else return "";
    }
}
