import java.util.ArrayList;
import java.util.Scanner;

public class denseArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();

        while(noOfTests-->0){

            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++){

                a[i] = sc.nextInt();

            }
            ArrayList<Integer> countArr = new ArrayList<>();
            for(int i=0; i<n-1; i++){

                int l = Math.min(a[i],a[i+1]);
                int m = Math.max(a[i],a[i+1]);
                int count=-1;
                if(m>2*l){

                    while(m>l){

                        l = 2*l;
                        count++;

                    }
                    countArr.add(count);
                }
            }
            int sum = 0;
            for(Integer c : countArr){
                sum+=c;
            }
            System.out.println(sum);
        }
    }
}
