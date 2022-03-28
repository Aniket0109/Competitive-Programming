import java.util.Scanner;

public class deletionOfTwoAdjacentLetters {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0){

            StringBuilder s = new StringBuilder(sc.next());
            String c = sc.next();
            int count=0;
            boolean flag = true;

            for(int i=0; i<s.length(); i++){

                if(s.charAt(i)==c.charAt(0)){

                    count++;
                    if(i%2!=0){

                        flag = false;

                    } else {

                        flag = true;
                        break;

                    }
                }
            }

            if(count==0){

                flag=false;
            }

            if(flag){

                System.out.println("YES");

            } else {

                System.out.println("NO");

            }
        }
    }
}