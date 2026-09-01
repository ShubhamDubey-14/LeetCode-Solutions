class Solution {
    List<Integer> findDisappearedNumbers(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            int correct = nums[index] - 1;
            if (nums[index] <= nums.length && nums[index] != nums[correct]) {
                swap(nums, index, correct);
            } else {
                index++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;

    }
    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}