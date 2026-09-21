package Java.gettingStarted;

import java.util.Arrays;

public class secondLargest {
    static int findSecondLargest(int []arr){
        int largest=findLargest(arr);
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    static int findLargest(int[] arr){
        int target=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>target){
                target=arr[i];
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,66,7,8,9};
        System.out.println(Arrays.toString(arr));
        int res=findSecondLargest(arr);
        System.out.println("Second Largest Element: "+res);
    }


}
