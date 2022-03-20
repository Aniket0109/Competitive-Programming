import java.util.Scanner;

public class prefixRemovals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while (noOfTests-- > 0) {

            StringBuilder s = new StringBuilder(sc.next());

            for(int i=0; i<s.length(); i++){

                for(int j=i+1; j<s.length(); j++){

                    s.deleteCharAt(i);
                    break;

                }
            }

            System.out.println(s);
        }
    }
}
