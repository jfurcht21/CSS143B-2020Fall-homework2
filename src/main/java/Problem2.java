public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int unique = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (i == nums.length-1)
            {
                if(nums[i] != nums[i-1])
                nums[unique] = nums[i];
                unique++;
                break;
            }
            if (nums[i] != nums[i+1])
            {
                nums[unique] = nums[i];
                unique++;
            }

        }
        return unique;

        /*int duplicateCounter = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length - 1; j++)
            {
                if(nums[i] == nums[j])
                {
                    nums[j] = nums[j+1];
                    duplicateCounter += 1;
                }
            }
        }

        return nums.length - duplicateCounter;*/
    }
}
