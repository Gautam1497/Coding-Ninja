/*
Code : Interesting Alphabets

Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
 */
import java.util.*;
public class AS5Q7_IA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        char a= (char) ('A'+n-1);
        for (int i=0;i<n;i++)
        {
            char b=(char) (a-i);
            for (int j=0;j<=i;j++)
            {
                System.out.print(b+" ");
                b++;
            }
            System.out.println();
        }
    }
}
