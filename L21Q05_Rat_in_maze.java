/*
Code: Rat In A Maze

You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direction ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can not enter into those cells and those with value 1 are open.
Input Format
Line 1: Integer N
Next N Lines: Each line will contain ith row elements (separated by space)
Output Format :
The output line contains true if any path exists for the rat to reach its destination otherwise print false.
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
true
Sample Input 2 :
3
1 0 1
1 0 1
0 1 1
Sample Output 2 :
 false
 */
import java.util.*;
public class L21Q05_Rat_in_maze {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            for (int j=0;j<n;j++){
                arr.add(sc.nextInt());
            }
            ar.add(arr);
        }
        boolean[][] a=new boolean[n][n];
        System.out.println(maze(ar,0,0,a));
    }
    public static boolean maze(ArrayList<ArrayList<Integer>> arr,int x,int y,boolean[][] a){
        int n=arr.size();
        if(x==n-1 && y==n-1 && arr.get(x).get(y)==1)return true;
        if(isSafe(arr,x,y,a)){
            a[x][y]=true;
            if(maze(arr,x,y+1,a))return true;
            if(maze(arr,x+1,y,a))return true;
            if(maze(arr,x,y-1,a))return true;
            if(maze(arr,x-1,y,a))return true;
            a[x][y]=false;
        }
        return false;
    }
    public static boolean isSafe(ArrayList<ArrayList<Integer>> arr,int x,int y,boolean [][] a){
        int n=arr.size();
        return x>=0 && y>=0 && x<n && y<n && arr.get(x).get(y)==1 && !a[x][y];
    }
}
