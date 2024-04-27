/*
Number of Digits

Given the code to find out and return the number of digits present in a number recursively. But it contains few bugs, that you need to rectify such that all the test cases should pass.
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
 */

import java.util.*;

public class AS14Q03_NOD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(numb(a));
    }
    public static int numb(int a){
        if(a/10==0)return 1;
        int n=numb(a/10);
        return n+1;
    }
}