/*
Sum Pattern

Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
 */
import java.util.*;
public class AS6Q3_SP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int s=0;
            for (int j=1;j<=i;j++)
            {
                s=s+j;
                if (j<i) System.out.print(j+"+");
                else System.out.print(j);
            }
            System.out.print("="+s);
            System.out.println();
        }
    }
}
