/*
Spiral Print

For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.
Refer to the Image:
Alt txt

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Sample Input 2:
2
3 3
1 2 3
4 5 6
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5
10 20 30
 */

import java.util.*;

public class AS12Q03_SP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of test cases: ");
        int t=sc.nextInt();
        while (t-->0)
        {
            System.out.print("Enter number of element in row: ");
            int row=sc.nextInt();
            System.out.print("Enter number of element in column: ");
            int col=sc.nextInt();
            System.out.println("Enter element's of matrix: ");
            int[][] arr=new int [row][col]; //Array declaration
            for (int i=0;i<row;i++)
            {
                for (int j=0;j<col;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Element's in spiral form are: ");
            Spiral(arr,row,col);//call function sum and give value of array arr
        }
    }
    public static void Spiral(int [][] arr,int row,int col) {
        int rowstart=0,colstart=0,count=0,n=row*col;
        while (count<n){
            for (int i=colstart;i<col && count<n;i++){
                System.out.print(arr[rowstart][i]+" ");
                count++;
            }
            rowstart++;
            for(int i=rowstart;i<row && count<n;i++) {
                System.out.print(arr[i][col-1]+" ");
                count++;
            }
            col--;
            for (int i=col-1;count<n && i>=colstart;--i){
                System.out.print(arr[row-1][i]+" ");
                count++;
            }
            row--;
            for (int i=row-1;count<n && i>=rowstart;--i){
                System.out.print(arr[i][colstart]+" ");
                count++;
            }
            colstart++;
        }
    }
}
