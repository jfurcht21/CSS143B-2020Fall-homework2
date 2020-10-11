public class Problem1 {

    /*
    I have created a nested for loop that iterates through the array as a whole one time.
    The inner for loop takes the current int from the outer loop and compares it to each number
    that comes after it in the array. If the number is bigger, it gets moved back in the array. This
    process repeats until the number is not larger than the one that comes after it in the array.
    The outer for loop then moves to the next number in the array. This process repeats until the entire
    array is sorted.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        for(int i=0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length -1; j++) {
                if (nums[j] >= nums[j + 1]) {
                    int tmp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

}
