import java.util.Scanner;

public class distance {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0){

            int x = sc.nextInt(), y = sc.nextInt();
            boolean xIsEven = false, yIsEven = false;

            if(x%2==0){

                xIsEven = true;

            }

            if(y%2==0){

                yIsEven = true;

            }

            if(xIsEven&&yIsEven){

                System.out.println((x/2)+" "+(y/2));

            } else {

                if(!xIsEven&&!yIsEven){

                    if(x>y){

                        System.out.println(((x-y)/2)+" "+y);

                    } else {

                        System.out.println(x+" "+((y-x)/2));

                    }
                } else {

                    System.out.println("-1 -1");

                }
            }
        }
    }
}
