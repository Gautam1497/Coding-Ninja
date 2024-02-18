/*
Odd Square

Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
 */
import java.util.*;
public class AS6Q4_OS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int c=n-i;
            int p=2*i+1;
            int q=1;
            for (int j=0;j<n;j++)
            {
                if(j<c){
                    System.out.print(p);
                    p+=2;
                }
                else {
                    System.out.print(q);
                    q+=2;
                }
            }
            System.out.println();
        }
    }
}
