/*
All Indices of Number

Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
 */

import java.util.Scanner;

public class L14Q018_AIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // Size of array
        int[] arr=new int [n]; // Declare Array
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); // Take input of array
        }
        int a=sc.nextInt(); // Number to check
        check(arr,a,0); // Call function with input of arr, no to check, and starting index n-1
    }
    public static int check(int[] arr,int a,int n){
        if(n== arr.length)return -1;
        if(arr[n]==a) System.out.print(n+" ");
        return check(arr,a, n+1);
    }
}