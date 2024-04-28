/*
Sum of Array

Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7
 */

import java.util.Scanner;

public class L14Q012_SOA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // Size of array
        int[] arr=new int [n]; // Declare Array
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); // Take input of array
        }
        System.out.println(sum(arr,0)); // Call function with input of arr and start index(0)
    }
    public static int sum(int[] arr,int n){
        if(n==arr.length)return 0;
        int s=sum(arr,n+1);
        return s+arr[n];
    }
}