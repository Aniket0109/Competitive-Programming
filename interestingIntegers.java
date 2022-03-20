import java.util.Scanner;

public class interestingIntegers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        for(int no=1; no<=noOfTests; no++){

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int count = 0;

            for(int i=n1; i<=n2; i++){

                int sum = 0;
                int product = 1;

                while(i>0){

                    int d = i%10;
                    sum+=d;
                    product*=d;
                    i/=10;

                    int a = Math.max(sum,product);
                    int b = Math.min(sum,product);

                    if(a%b==0){

                        count++;

                    }

                }
            }
            System.out.println("Case #"+no+": "+count);
        }
    }
}
