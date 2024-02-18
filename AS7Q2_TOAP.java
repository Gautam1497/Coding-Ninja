/*
Terms of AP

Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
 */
import java.util.*;
public class AS7Q2_TOAP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=1;
        int ap;
        for(int i=0;i<n;i++)
        {
            ap=3*a+2;
            a++;
            if(ap%4==0)n+=1;
            else System.out.print(ap+" ");
        }
    }
}
