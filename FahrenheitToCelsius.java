public class FahrenheitToCelsius {
    public static void ftc(int a,int b,int c){
        for(int i=a;i<=b;i=i+c){
            double cel=(5.0/9)*(i-32);
            System.out.print(i+" "+(int)cel);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ftc(0,100,20);
    }
}
