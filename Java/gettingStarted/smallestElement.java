package Java.gettingStarted;

import java.util.Arrays;

public class smallestElement {
    static int findSmallest(int[] arr){
        int target=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<target){
                target=arr[i];
            }
        }
        return target;
    }
    public static void main(String[] args) {
         int [] arr={1,2,3,4,66,7,0,9};
        System.out.println(Arrays.toString(arr));
        int res=findSmallest(arr);
        System.out.println("Smallest Element: "+res);
    }
}
