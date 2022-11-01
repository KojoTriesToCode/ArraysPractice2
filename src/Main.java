public class Main {
    public static void main(String[] args) {

    }
        /*
        Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        firstLast6([1, 2, 6]) → true
        codng bat
        codifirstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false
         */
        public static boolean firstLast6(int[] nums) {
            if(nums[0]==6 || nums[nums.length-1]==6)
                return true;
                return false;
        }
        /*
        Return an int array length 3 containing the first 3 digits
         */
         public static int[] makePi() {
             return new int[] {3,1,4};
         }

    /*
    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
            make2([4, 5], [1, 2, 3]) → [4, 5]
    make2([4], [1, 2, 3]) → [4, 1]
    make2([], [1, 2]) → [1, 2]
    */

    public static int[] make2(int[] a, int[] b) {
        int ans[] = new int[2];

        if (a.length >= 2) {
            ans[0] = a[0];
            ans[1] = a[1];
        }
        else if (a.length ==1) {
            ans[0] = a[0];
            ans[1] = b[0];
        }
        else {
            ans[0] = b[0];
            ans[1] = b[1];
        }
        return ans;
       }
    }