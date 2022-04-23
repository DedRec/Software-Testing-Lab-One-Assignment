import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args){
        sum();
    }
    public static void sum(){
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int x, y, z, sumx=0, sumy=0, sumz = 0;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            sumx += x;
            sumy += y;
            sumz +=z;
        }
        String s = vector(sumx, sumy, sumz);
        System.out.println(s);
    }
    public static String vector(int sumx, int sumy, int sumz){
        if (sumx == 0 && sumy == 0 && sumz == 0) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}