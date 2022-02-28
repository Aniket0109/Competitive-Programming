import java.util.Scanner;

public class constructRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while (noOfTests-- > 0) {

            int l1 = sc.nextInt(), l2 = sc.nextInt(), l3 = sc.nextInt();
            int max = Math.max(l1,Math.max(l2,l3));
            int sum = l1+l2+l3;

            if(sum==2*max){

                System.out.println("YES");

            } else {

                if(l1==l2){

                    if(l3%2==0){

                        System.out.println("YES");

                    } else
                        System.out.println("NO");

                } else if(l2==l3){

                    if(l1%2==0){

                        System.out.println("YES");

                    } else
                        System.out.println("NO");

                } else if(l1==l3){

                    if(l2%2==0){

                        System.out.println("YES");

                    } else
                        System.out.println("NO");

                } else {

                    System.out.println("NO");
                }
            }
        }
    }
}
