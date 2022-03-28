import java.util.Scanner;

public class proveHimWrong {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while (noOfTests-->0){

            int n = sc.nextInt();
            long check = (long) Math.pow(3,n);

            if(check>Integer.MAX_VALUE){

                System.out.println("NO");

            } else {

                System.out.println("YES");
                for(int i=0; i<n; i++){

                    System.out.print((int)Math.pow(3,i)+" ");

                }
                System.out.println();
            }
        }
    }
}