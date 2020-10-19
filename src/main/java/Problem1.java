public class Problem1 {

    /*
    I used a while loop that iterates through the array one time. This algorithm will not work
    if there are more than three numbers in the array. It uses a temp variable to sort the array
    as the array is iterated through. If the value of the number is high or lower than the
    "mid"(the number that is being used as the comparison) the number will then be swapped
    either lower or higher. If the number is equivalent to the mid, the loop moves on to the next number.
    I used https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/ as a reference when I hit a blocker
    but put my own twist on it by adding a validation to check for a valid array. I also added some logic to
    remove unnecessary swapping.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp;

        if(nums.length >= 1) {
            while (mid <= high) {
                //If the number at index 0 == 0, loops moves on
                if(mid == 0 && nums[0] == 0)
                {
                    mid++;
                    continue;
                }
                //If the number at the index == the number before the index
                //That number is sorted and therefore logic skips it
                if(mid >=1 && nums[mid] == nums[mid-1])
                {
                    mid++;
                    continue;
                }
                switch (nums[mid]) {
                    case 0: {
                        temp = nums[low];
                        nums[low] = nums[mid];
                        nums[mid] = temp;
                        low++;
                        mid++;
                        break;
                    }
                    case 1: {
                        mid++;
                        break;
                    }
                    case 2: {
                        temp = nums[mid];
                        nums[mid] = nums[high];
                        nums[high] = temp;
                        high--;
                        break;
                    }
                }
            }
        }
        else
            System.out.println("Array must be at least one integer long");
    }

}
