import java.util.Scanner;

public class Watermelon_problem {

    public static void main(String[] args){
        input();
    }
    public static int input(){
        Scanner sc=new Scanner(System.in);
        int w = sc.nextInt();
        String s = divide(w);
        System.out.println(s);
        return w;
    }
    public static String divide(int w){
            if (w % 2 == 0 && w > 2) {
                return "YES";
            } else {
                return "NO";
            }
    }
}
