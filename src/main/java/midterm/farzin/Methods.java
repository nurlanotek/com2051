package midterm.farzin;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert length: ");
        int N = input.nextInt();

        int[] arr1 = new int[N];

        System.out.println("Insert numbers: ");
        for (int i =0; i<N; i++){
            arr1[i] = input.nextInt();
        }

        System.out.println("Insert length: ");
        int M = input.nextInt();
        int arr2[] = new int[M];
        System.out.println("Insert numbers: ");

        for (int i =0; i<M; i++){
            arr1[i] = input.nextInt();
        }

        // processing and output
        int S = N + M;
        int c = 1;
        int p = 0;
        int doodle = 0;
        int[] new_arr = new int[S];

        for (int i=0; i<S; i++){

            for (int j =0; j<N; j++){
                if (arr1[j] <= c){
                    new_arr[p] = arr1[j];
                    p++;
                }
            }

            for (int j =0; j<M; j++){
                if (arr2[j] <= c){
                    new_arr[p] = arr2[j];
                    p++;
                }
            }
            c++;
            i++;
        }

        System.out.println("New array: " + "place is not working");
        for (int i=0; i<S; i++){
            System.out.print(new_arr[i]+",");
        }
    }
}