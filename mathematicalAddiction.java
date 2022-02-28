import java.util.Scanner;

public class mathematicalAddiction {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0){

            long u = sc.nextInt(),v = sc.nextInt();

            System.out.println((-u*u)+" "+(v*v));
        }
    }
}