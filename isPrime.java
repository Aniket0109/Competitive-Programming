import java.util.Scanner;

public class isPrime {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0){

            int n = sc.nextInt();
            boolean isPrime = true;

            for (int i=2;i*i<n;i++){

                if(n%i==0){

                    isPrime = false;
                    break;

                }

            }

            if(isPrime){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }

        }
    }
}
