/*
Code : Reverse Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
 */
import java.util.*;
public class AS5Q4_RNP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int k=i+1;
            for (int j=0;j<=i;j++)
            {
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }
}
