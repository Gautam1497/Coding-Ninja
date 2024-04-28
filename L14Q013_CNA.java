/*
Check Number in Array

Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
 */

import java.util.Scanner;

public class L14Q013_CNA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // Size of array
        int[] arr=new int [n]; // Declare Array
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); // Take input of array
        }
        int a=sc.nextInt(); // Number to check
        System.out.println(check(arr,a,n-1)); // Call function with input of arr, no to check, and starting index 0
    }
    public static boolean check(int[] arr,int a,int n){
        if(n<0)return false;
        if(arr[n]==a)return true;
        return (check(arr,a, n-1));
    }
}