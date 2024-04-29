/*
Count Zeros

Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer N
Output Format :
Number of zeros in N
Constraints :
0 <= N <= 10^9
Sample Input 1 :
10204
Sample Output 1 :
2
Sample Input 2 :
708000
Sample Output 2 :
4
 */

import java.util.Scanner;

public class AS14Q02_CZ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n){
        if(n/10==0){
            if(n==0)return 1;
            else return 0;
        }
        if(n%10==0)return count(n/10)+1;
        else return count(n/10);
    }
}
