import java.util.Scanner;

public class XYSequence {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();
        while (noOfTests-->0){

            int n = sc.nextInt(), B = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            long digit = 0, sum =0;
            while(n-->0){

                if(digit >=B){

                    digit -=y;

                } else {

                    digit +=x;
                    if(digit>B){

                        digit-=(x+y);

                    }

                }

                sum+=digit;

            }
            System.out.println(sum);
        }
    }
}
