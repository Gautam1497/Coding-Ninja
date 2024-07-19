/*
Staircase

A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
Input format :
Integer N
Output Format :
Integer W
Constraints :
1 <= N <= 30
Sample Input 1 :
4
Sample Output 1 :
7
Sample Input 2 :
5
Sample Output 2 :
13
 */

import java.util.Scanner;

public class AS17Q02_Staircase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(check(a));
    }
    public static int check(int a){
        if(a<0)return 0;// if a is 1 or 2 then a-2 and a-3 will be 0
        if(a==0)return 1;
        int x = check(a-3);
        int y=check(a-2);
        int z=check(a-1);
        return x+y+z;
    }
}
