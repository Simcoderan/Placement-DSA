package Arrays;

import java.util.Arrays;

public class Arr26 {
    // Method to remove duplicates from a sorted array
    public static int removeDuplicates(int[] nums) {

        int k=1;

        for (int j=1;j<nums.length;j++){

            if(nums[j]!=nums[j-1]){
                nums[k]=nums[j];
                k=k+1;

               


            }
        }

        return k;
   
}
}
