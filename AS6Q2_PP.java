/*
Parallelogram Pattern

Write a program to print parallelogram pattern for the given N number of rows.
For N = 4



The dots represent spaces.
Input Format :
 A single integer : N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
***
 ***
  ***
 */
import java.util.*;
public class AS6Q2_PP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n+i;j++)
            {
                if(j<i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
