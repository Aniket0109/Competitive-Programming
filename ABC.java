import java.util.Scanner;

public class ABC {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0){

            int n = sc.nextInt();
            String s = sc.next();
            int count0 = 0;

            for(int i=0; i<n; i++){

                if(s.charAt(i)=='0'){

                    count0++;

                }
            }

            if(n==1){

                System.out.println("YES");

            } else {

                if (2 * count0 == n) {

                    if (n == 2) {

                        System.out.println("YES");

                    } else {

                        System.out.println("NO");

                    }
                } else {

                    System.out.println("NO");

                }
            }
        }
    }
}
