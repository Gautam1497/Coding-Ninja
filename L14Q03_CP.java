/*
Calculate Power

Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints :
1 <= x <= 30
0 <= n <= 30
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32
 */

import java.util.*;

public class L14Q03_CP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int power=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(pow(power,base));
    }
    public static int pow(int power,int base){
        if(power==0)return 1;

        int ans=pow(power-1,base);
        return ans*base;
    }
}
