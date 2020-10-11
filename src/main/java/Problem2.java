public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int duplicateCounter = 0;
        for(int i = 0; i <nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    nums[j] = nums[j+1];
                    duplicateCounter += 1;
                }
            }
        }

        return nums.length - duplicateCounter;
    }
}
