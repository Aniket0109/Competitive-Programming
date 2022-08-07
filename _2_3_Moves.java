import java.util.Scanner;

public class _2_3_Moves {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0){

            int n = sc.nextInt();

            if(n==1) {
                System.out.println(2);
                continue;
            }
            if(n<0)
                n = -n;

            int mod3 = n%3;
            int div3 = n/3;

            if(mod3==0)
                System.out.println(div3);
            else
                System.out.println(div3+1);

        }
    }
}
