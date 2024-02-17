/*
Code : Alpha Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
 */
import java.util.*;
public class AS5Q5_AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        char a='A';
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(a+" ");
            }
            a++;
            System.out.println();
        }
    }
}
