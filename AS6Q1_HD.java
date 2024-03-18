/*
Half Diamond Pattern

Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
 */
import java.util.*;
public class AS6Q1_HD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int t=i-1;
            for (int j=0;j<2*i+1;j++)
            {
                if(j==0 || j==2*i){
                    System.out.print("*");
                }
                else if(j<=i) System.out.print(j);
                else if(j != 2 * i){
                    System.out.print(t);
                    t--;
                }
            }
            System.out.println();
        }
        int b=1;
        for(int i=0;i<2*n+1;i++){
            if(i==0 || i==2*n) System.out.print("*");
            else if (i<=n) System.out.print(i);
            else {
                System.out.print(n - b);
                b++;
            }
        }
        System.out.println();
        for (int i=0;i<n;i++)
        {
            int a=2;
            for (int j=0;j<2*(n-i)-1;j++)
            {
                if(j==0 || j==2*(n-i)-2) System.out.print("*");
                else if (j<n-i) System.out.print(j);
                else {
                    System.out.print(n-a-i);
                    a++;
                }
            }
            System.out.println();
        }
    }
}