/*
Replace pi (recursive)

Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
Sample Input 1 :
xpix
Sample Output :
x3.14x
Sample Input 2 :
pipi
Sample Output :
3.143.14
Sample Input 3 :
pip
Sample Output :
3.14p
 */
import java.util.*;
public class AS15Q01_ReplacePi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(replace(s));
    }
    public static String replace(String s){
        int n=s.length();
        if(n<=1)return s;
        String str=replace(s.substring(1));
        if(s.charAt(0)=='p' && str.charAt(0)=='i')str=3.14+str.substring(1);
        else str=s.charAt(0)+str;
        return str;
    }
}

