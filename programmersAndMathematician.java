import java.util.Scanner;

public class programmersAndMathematician {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while (noOfTests-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(Math.min(Math.min(a,b),((a+b)/4)));

        }
    }

}