package array;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1]) {
            return nums.length;
        } else if (target < nums[0]) {
            return 0;
        }
        int p = 0, r = nums.length;
        while(p < r) {
        	int mid = (p + r) / 2;
        	if (nums[mid] == target) {
        		return mid;
        	} else if (nums[mid] < target) {
        		p = mid + 1;
        	} else {
        		r = mid;
        	}
        }
    	return p;
    }
}
