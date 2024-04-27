/*
Print Numbers

Given is the code to print numbers from 1 to n in increasing order recursively. But it contains few bugs that you need to rectify such that all the test cases pass.
Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space)
Constraints :
1 <= n <= 10000
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4
 */

import java.util.*;
public class AS14Q02_PN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        print(a);
    }
    public static int print(int a){
        if(a==1)return 1;
        int p=print(a-1);
        System.out.print(p+" ");
        return p+1;
    }
}
