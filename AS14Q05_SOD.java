/*
Sum of digits (recursive)

Write a recursive function that returns the sum of the digits of a given integer.
Input format :
Integer N
Output format :
Sum of digits of N
Constraints :
0 <= N <= 10^9
Sample Input 1 :
12345
Sample Output 1 :
15
Sample Input 2 :
9
Sample Output 2 :
9
 */

import java.util.Scanner;

public class AS14Q05_SOD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
    }
    public static int check(int n){
        if(n%10==0)return 0;
        int s=check(n/10);
        return s+n%10;
    }
}
