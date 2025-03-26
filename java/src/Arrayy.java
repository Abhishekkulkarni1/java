import java.util.*;

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
//        int[] arr = {1, 2, 13, 24, 15, 10};
//        System.out.println(isSecondLargest(arr));

        /* ********************* REMOVE DUPLICATES FROM AN ARRAY ********************* */
//        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};
//        int newSize = removedDuplicate(arr);
//
//        for (int i = 0; i < newSize; i++) {
//            System.out.print(arr[i] + " ");
//        }

        /* ********************* MOVE ZEROS TO END ********************* */
//        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, 0};
//        moveZeros(arr);
//        System.out.println(Arrays.toString(arr));

        /* ********************* LEFT ROTATE BY ONE ********************* */
//        int[] arr = {1, 2, 3, 4, 5};
//        leftRotateByOne(arr);
//        System.out.println(Arrays.toString(arr));

        /* ********************* FIND MAX CONSECUTIVES ********************* */
//        int[] arr = {1, 0, 0, 0, 1, 1 ,1, 0, 0};
//        System.out.println(maxConsecutiveOnes(arr));



        /* ********************* RIGHT ROTATE BY N ********************* */
//        int[] arr = {1, 2, 3, 4, 5};
//        rightRotateByOne(arr, 11);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        /* ********************* FIND MISSING NUMBERS ********************* */
//        int[] arr = {1, 2, 4, 5, 6, 8};
//        missingNumber(arr);
//        System.out.println(missingNumber(arr));

        /* ********************* FIND SINGLE NUMBER ********************* */
//        int[] arr = {1, 2, 2, 3, 3};
//        singleNumber(arr);
//        System.out.println(singleNumber(arr));

        /* ********************* TWO SUM ********************* */
        int[] arr = {1, 2, 2, 3, 4};
        twoSum(arr, 5);
        System.out.println(Arrays.toString(twoSum(arr, 7)));
    }
    /* ********************* TWO SUM ********************* */
    static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
    /* ********************* FIND SINGLE NUMBER ********************* */
//    static int singleNumber(int[] arr) {
//        int xor = 0;
//        for (int i = 0; i < arr.length; i++) {
//            xor = xor ^ arr[i];
//        }
//        return xor;
//    }
    
    /* ********************* FIND MISSING NUMBERS ********************* */
//    static int missingNumber(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int missingNum = 0;
//            for (int j = 0; j < arr.length - 1; j++) {
//                if(arr[j] == i){
//                    missingNum = 1;
//                    break;
//                }
//            }
//            if(missingNum == 0){
//                return i;
//            }
//        }
//        return -1;
//        int n = arr.length;
//        int totalSum = (n * (n+1))/2;
//        int sum = 0;
//        for (int i = 0; i < n-1; i++) {
//            sum = sum + arr[i];
//        }
//        int missingNum = totalSum - sum;
//        return missingNum;
//    }

    /* ********************* RIGHT ROTATE BY N ********************* */
//    static void reverseArr(int[] arr, int start, int end){
//        while(start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//    static void rightRotateByOne(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//        reverseArr(arr, 0, n - k - 1);
//        reverseArr(arr, n - k, n -1);
//        reverseArr(arr, 0, n - 1);
//    }
    /* ********************* FIND MAX CONSECUTIVES ********************* */
//    static int maxConsecutiveOnes(int[] arr) {
//        int max = 0;
//        int cnt = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 1){
//                cnt++;
//                max = Math.max(max, cnt);
//            } else{
//                cnt = 0;
//            }
//        }
//        return max;
//    }

//    static void leftRotateByOne(int[] arr) {
//        int temp = arr[0];
//        int n = arr.length;
//        for(int i = 1; i < n; i++){
//            arr[i-1] = arr[i];
//        }
//        arr[n-1] = temp;
//    }

    /* ********************* MOVE ZEROS TO END ********************* */
//    static void moveZeros(int[] arr) {
//        int i = 0;
//        for (int j = 0; j < arr.length; j++) {
//            if(arr[j] != 0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//            }
//        };
//    }

    /* ********************* REMOVE DUPLICATES FROM AN ARRAY ********************* */
//    static int removedDuplicate(int[] arr) {
//        int i = 0;
//        for (int j = 0; j < arr.length; j++) {
//            if(arr[i] != arr[j]) {
//                arr[i+1] = arr[j];
//                i++;
//            }
//        }
//        return (i+1);
//    }
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
//    static int isSecondLargest(int[] arr){
//        int n = arr.length;
//        int max = arr[0];
//        int secLargest = -1;
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
//        for (int i = 0; i < n; i++) {
//            if(arr[i] > max){
//                secLargest = max;
//                max = arr[i];
//            } else if (arr[i] < max && arr[i] > secLargest) {
//                secLargest = arr[i];
//            }
//        }
//        return secLargest;
    }
