import java.util.Arrays;
import java.util.Scanner;

public class anubhavQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] occur = new int[n];
        Arrays.fill(occur, 0);
        System.out.println("Enter " +n+ " array elements between 0 to "+(n-1));
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            try {
                occur[arr[i]]++;
            } catch (Exception e){

                System.out.println("Input is greater than size of Array");
                break;
            }
        }
        int count=0;
        for(int i=0; i<n; i++) {
            if(occur[i]>1){
                for(int j=i+1; j<n;j++){

                    if(occur[i]==occur[j]){

                        count++;

                    }
                }
            }
        }

        if(count>0){

            System.out.println("false");

        } else {

            System.out.println("true");

        }
    }
}