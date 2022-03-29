import java.util.Scanner;

public class marinAndAntiCoPrimePermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while (noOfTests-- > 0) {

            int n = sc.nextInt();

            if (n%2 != 0) {

                System.out.println(0);

            } else {
                long ans = 1, mod = 998244353;
                for (int i = 1; i <= n / 2; ++i) {

                    ans *= (long) i *i;
                    ans %= mod;

                }
                System.out.println(ans);
            }
        }
    }
}