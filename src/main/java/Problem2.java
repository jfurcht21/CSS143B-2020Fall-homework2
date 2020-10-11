public class Problem2 {

    /*
    This algorithm doesn't actually remove duplicates from an array but it changes the first
    part of the array to represent each unique character one time. The actual length of the array does not
    change. This iterates through the array, keeping track of the last unique number in the array.
    If a duplicate number is found, the algorithm skips over it. When the algorithm reaches the next
    unique number, it will overwrite the previous duplicate with the unique number. When it reaches the
    end of the array, the algorithm actually compares to the previous number to avoid an array out of
    bound exception. Used (https://www.geeksforgeeks.org/remove-duplicates-sorted-array/) for reference when
    I ran into blockers.
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
