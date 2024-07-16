import java.util.*;

public class L17Q01_Return_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> str=check(s);
        for (String string : str) {
            System.out.println(string);
        }
    }

    private static ArrayList<String> check(String s) {
        ArrayList<String> str=new ArrayList<>();
        if(s.isEmpty()){
            str.add("");
            return str;
        }
        ArrayList<String> str2=check(s.substring(1));
        str.addAll(str2);
        for (String string : str2) str.add(s.charAt(0) + string);
        return str;
    }
}