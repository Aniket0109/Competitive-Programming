import java.util.Arrays;
import java.util.Scanner;

public class maximumCakeTastiness {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while (noOfTests-- > 0) {

            long n = sc.nextLong();
            long[] a = new long[(int) n];

            for(int i=0; i<n; i++){

                a[i] = sc.nextLong();

            }

            Arrays.sort(a);
            System.out.println(a[(int)n-1]+a[(int)n-2]);
        }
    }
}
