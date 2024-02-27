/*
Sum of Two Arrays

Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
Note:
The sizes N and M can be different.

Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry.

No need to print the elements of the output array/list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the required sum of the arrays/list in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0
Sample Input 2:
2
3
8 5 2
2
1 3
4
9 7 6 1
3
4 5 9
Sample Output 2:
0 8 6 5
1 0 2 2 0
 */
import java.util.*;
public class AS10Q6_SOTA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t=sc.nextInt();
        while (t-->0)
        {
            System.out.print("Enter number of element in array 1: ");
            int n=sc.nextInt();
            System.out.print("Enter element of array 1: ");
            int[] arr=new int[n];
            for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.print("Enter number of element in array 2: ");
            int m=sc.nextInt();
            System.out.print("Enter element of array 2: ");
            int[] arr2=new int[m];
            for (int i=0;i<m;i++)
            {
                arr2[i]=sc.nextInt();
            }
            int[] ans;
            if(arr.length>=arr2.length){
                ans=sum(arr,arr2);
            }
            else ans=sum(arr2,arr);
            for (int an : ans) {
                System.out.print(an + " ");
            }
            System.out.println();
        }
    }
    public static int[] sum(int[] arr,int[] arr2)
    {
        int n=arr.length-1;
        int m=arr2.length-1;
        int a= arr.length;
        int r=0;
        int[] ans=new int [a+1];
        while (n>=0 && m>=0)
            {
                int s=arr[n]+arr2[m]+r;
                ans[a]=s%10;
                r=s/10;
                n--;
                m--;
                a--;
            }
            while (n>=0){
                int s=arr[n]+r;
                ans[a]=s%10;
                r=s/10;
                n--;
                a--;
            }
            while (m>=0)
            {
                int s=arr2[m]+r;
                ans[a]=s%10;
                r=s/10;
                m--;
                a--;
            }
        ans[0]=r;
        return ans;
    }
}
