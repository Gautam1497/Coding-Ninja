/*
Binary to decimal

Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
 */
import java.util.*;
public class AS7Q4_BTD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n=sc.nextInt();
        int l=Integer.toString(n).length();
        int num = 0;
        for (int i=0;i<l;i++)
        {
            num+= (int) (n%10*(Math.pow(2,i)));
            n/=10;
        }
        System.out.println(num);
    }
}