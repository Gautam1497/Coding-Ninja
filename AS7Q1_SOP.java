/*
Sum or Product

Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
Input format :
Line 1 : Integer N
Line 2 : Choice C
Output Format :
 Sum or product according to user's choice
Constraints :
1 <= N <= 12
Sample Input 1 :
10
1
Sample Output 1 :
55
Sample Input 2 :
10
2
Sample Output 2 :
3628800
Sample Input 3 :
10
4
Sample Output 3 :
-1
*/
import java.util.*;
public class AS7Q1_SOP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number N and a choice C (1 for sum 2 for product)");
        int n=sc.nextInt();
        int c=sc.nextInt();
        if(c==1) System.out.println(sum(n));
        else if(c==2) System.out.println(product(n));
        else System.out.println("-1");
    }
    public static int sum(int n){
        int result=0;
        for(int i=1;i<=n;i++)
        {
            result+=i;
        }
        return result;
    }
    public static int product(int n){
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result*=i;
        }
        return result;
    }
}
