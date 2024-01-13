import java.util.Scanner;

public class Add2NoUsingFunction {
    public static int sum2(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum2(a,b));
    }
}
