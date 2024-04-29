/*
Multiplication (Recursive)

Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
Input format :
Line 1 : Integer M
Line 2 : Integer N
Output format :
M x N
Constraints :
0 <= M <= 1000
0 <= N <= 1000
Sample Input 1 :
3
5
Sample Output 1 :
15
Sample Input 2 :
4
0
Sample Output 2 :
0
 */

import java.util.Scanner;

public class AS14Q01_MULTIPLY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        System.out.println(mul(n,m));
    }
    public static int mul(int n,int m){
        if(n==0)return 0;
        int s=mul(n-1,m);
        return s+m;
    }
}