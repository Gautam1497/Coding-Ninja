/*
Square Root (Integral)

Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For example if number given is 18, answer is 4.
Input format :
Integer N
Output Format :
Square root of N (integer part only)
Constraints :
0 <= N <= 10^8
Sample Input 1 :
10
Sample Output 1 :
3
Sample Input 2 :
4
Sample Output 2 :
2
 */
import java.util.*;
public class AS7Q6_SR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            if(i*i>n){
                System.out.println(i-1);
                break;
            }
        }
    }
}
