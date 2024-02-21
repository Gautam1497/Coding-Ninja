/*
Fibonacci Number

Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false
 */
import java.util.*;
public class AS8Q2_FS {
    public static boolean fs(int n) {
        int a=0;
        int b=1;
        while (b<n)
        {
            int temp=a+b;
            a=b;
            b=temp;
        }
        return b == n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(fs(n)) System.out.println("True");
        else System.out.println("False");
    }
}
