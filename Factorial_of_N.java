// time & space  complexity is 0(n)


public class Factorial_of_N {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_num = factorial(n - 1);
        int fact_n = n * fact_num;
        return fact_n;
    }

    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println("The factorial of a given no. is " + ans);
    }
}
