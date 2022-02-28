import java.util.Scanner;

public class AMDeviation {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0){

            int[] a = new int[3];

            for (int i=0; i<3; i++){

                a[i] = sc.nextInt();

            }

            int d = Math.abs(a[0]+a[2]-2*a[1]);

            if (d%3==0){

                System.out.println(0);

            } else {

                System.out.println(1);

            }
        }
    }
}
