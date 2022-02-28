import java.util.Scanner;

public class lifeOfFlower {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0){

            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++){

                a[i] = sc.nextInt();

            }

            int count=1,count1=0;

            for(int i=0; i<n-1; i++) {

                if (a[i]==1){

                    if(a[i+1]==1){

                        count+=5;

                    } else {

                        count++;

                    }
                } else {

                    if (a[i+1]==0){

                        count1++;

                    }
                }
            }

            if(a[n-1]==1){

                count++;

            }

            if(count1>0){
                System.out.println(-1);
            }else {
                System.out.println(count);
            }
        }
    }
}
