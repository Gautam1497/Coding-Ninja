public class L18Q34_DynamicArray {
    public static void main(String[] args) {
        DynamicArray a=new DynamicArray();
        for(int i=0;i<11;i++){
            a.add(10+i);
        }
        System.out.println(a.size());
        System.out.println(a.get(2));
        a.set(3,30);
        a.add(4,40);
        System.out.println(a.get(3));
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
        a.remove(4);
        System.out.println();
        while (!a.isEmpty()){
            System.out.println(a.removeLast());
            System.out.println("size- "+a.size());
        }

    }
}
class DynamicArray {
    private int[] a;
    private int next;
    public DynamicArray(){
        a=new int[5];
        next=0;
    }
    public void add(int i){
        if(next>=a.length) {
            doubleAr();
        }
        a[next]=i;
        next++;
    }

    private void doubleAr() {
        int[] t=a;
        a=new int[2*t.length];
        for (int i=0;i<t.length;i++){
            a[i]=t[i];
        }
    }

    public int size(){
        return next;
    }
    public int get(int i){
        if(i>next || i<0)return -1;
        return a[i];
    }

    public void set(int i, int x) {
        if(i>next || i<0)return;
        a[i]=x;
    }
    public boolean isEmpty(){
        return next==0;
    }

    public int removeLast() {
        if(isEmpty()){
            return -1;
        }
        int t=a[next-1];
        next--;
        return t;
    }
    public void add(int x,int n){
        if(next>=a.length)doubleAr();
        for (int i=next;i>x;i--)a[i]=a[i-1];
        a[x]=n;
    }
    public void remove(int x){
        for(int i=x;i<next;i++)a[i]=a[i+1];
        next--;
    }
}
