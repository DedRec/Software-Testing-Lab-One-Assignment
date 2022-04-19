import java.util.Scanner;

public class Watermelon_problem {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w = sc.nextInt();
        String s = divide(w);
        System.out.println(s);
    }
    public static String divide(int w){
            if (w % 2 == 0 && w > 2) {
                return "YES";
            } else {
                return "NO";
            }
    }
}
