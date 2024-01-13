public class Factorial {
    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++)
            f=f*i;
        return f;
    }
    public static void main(String arg[])
    {
        System.out.println(fact(5));
    }
}
