package Java.gettingStarted;

import java.util.Arrays;

public class SecondLargestElement {
   
    public static  int secondLargestElement(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
           
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];                
            }
            else if (nums[i] > secondLargest && nums[i] != largest) {
        secondLargest = nums[i];
    }    
    }
     if(secondLargest==Integer.MIN_VALUE){
        return -1;
    }
    return secondLargest;
   
}
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        int res=secondLargestElement(arr);
        System.out.println("Second largest Element: "+res);
    }
}
