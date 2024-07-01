import java.util.Scanner;

public class PrintXpowerN {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // this is optional statement
      if (x == 0) {
            return 0;
        }
        int xPower1 = calcPower(x, n - 1);
        int xPown = x * xPower1;
        return xPown;
    }

    public static void main(String[] args) {

 int x = 2 , n   = 5;
int ans = calcPower(x,n);
        System.out.println(ans);
    }

}
