import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class makeEven {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0) {

            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();

            if (n % 2 == 0) {

                System.out.println(0);

            } else {

                while (n > 0) {

                    a.add(n % 10);
                    n = n / 10;

                }
                Collections.reverse(a);

                if(a.get(0)%2==0){

                    System.out.println(1);

                } else {

                    int count =0;
                    for (int i=1; i<a.size(); i++){

                        if(a.get(i)%2==0){

                            count++;

                        }
                    }

                    if (count>0){

                        System.out.println(2);

                    } else {

                        System.out.println(-1);

                    }
                }
            }
        }
    }
}