import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayy {
    public static void main(String[] args) {
//        int[] arr;
//        arr = new int[6];
//        System.out.println(arr[4]);

        /* ********************* 2D ARRAYS ********************* */
//        int [][] arr2D;
//        arr2D = new int[][]{
//                {1, 2, 3, 4},
//                {5, 6},
//                {7, 8, 9, 10, 11}
//        };
////        System.out.println(arr2D[1][1]);
//        for (int row = 0; row < arr2D.length; row++) {
////            System.out.println(Arrays.toString(arr2D[row]));
//            for (int col = 0; col < arr2D[row].length; col++) {
////                System.out.print(col);
////                System.out.println(Arrays.toString(arr2D[col]))   ;
//                System.out.print(arr2D[row][col] + ", ");
//            }
//            System.out.println();
//        }

        /* ********************* ARRAY LIST ********************* */
//        ArrayList<Integer> list = new ArrayList<> (10);
//        ArrayList<String> listString = new ArrayList<> (10);
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        listString.add("Hey");
//        listString.add("Abhishek");
//        listString.add("Here");
//
//        System.out.println(list);
//        System.out.println(listString);

        /* ********************* 2D ARRAY LIST ********************* */
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> list = new ArrayList<> (5);
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 3; col++) {
//                list.get(row).add(scanner.nextInt());
//            }
//        }
//        System.out.println(list);

        /* ********************* SWAP 2 NUMBERS ********************* */
//        int[] arr = {1, 2, 3, 4, 5};
//        swap(arr, 1, 2);
//        System.out.println(Arrays.toString(arr));

        /* ********************* SWAP AN ARRAY ********************* */
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        swap(arr);
//        System.out.println(Arrays.toString(arr));

        /* ********************* LARGEST NUM OF AN ARRAY ********************* */
//        int[] arr = {1020202, 21212, 310, 41, 51};
//        System.out.println(isLargest(arr));

        /* ********************* SECOND LARGEST NUM OF AN ARRAY ********************* */
        int[] arr = {1, 2, 13, 24, 15, 10};
        System.out.println(isSecondLargest(arr));
    }
    /* ********************* SWAP 2 NUMBERS ********************* */
//    static void swap(int[] arr,int index1, int index2){
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }

    /* ********************* SWAP AN ARRAY ********************* */
//    static void swap(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }

    /* ********************* LARGEST NUM OF AN ARRAY ********************* */
//    static int isLargest(int[] arr){
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] >= max){
//                max = arr[i];
//            }
//        };
//        return max;
//    }

    /* ********************* SECOND LARGEST NUM OF AN ARRAY ********************* */
    static int isSecondLargest(int[] arr){
        int n = arr.length;
        int max = arr[0];
        int secLargest = -1;
//        for(int i = 0; i < n; i++ ){
//            for (int j = 1; j < arr.length; j++) {
//                if(arr[j] >= max){
//                    max = arr[j];
//                }
//            };
//            if(arr[i] != max && arr[i] > secLargest){
//                secLargest = arr[i];
//            }
//        }
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                secLargest = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
}
