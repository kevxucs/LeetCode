package array;

public class SearchRange {
	public int[] searchRange(int[] nums, int target) {
		int[] targetRange = { -1, -1 };
		int p = 0, r = nums.length;
		while (p < r) {
			int mid = (p + r) / 2;
			if (nums[mid] == target) {
				if (mid == 0 || nums[mid - 1] < target) {
					targetRange[0] = mid;
					break;
				} else {
					r = mid;
				}
			} else if (nums[mid] < target) {
				p = mid + 1;
			} else {
				r = mid;
			}
		}
		p = 0;
		r = nums.length;
		while (p < r) {
			int mid = (p + r) / 2;
			if (nums[mid] == target) {
				if (mid == nums.length - 1 || nums[mid + 1] > target) {
					targetRange[1] = mid;
					break;
				} else {
					p = mid + 1;
				}
			} else if (nums[mid] < target) {
				p = mid + 1;
			} else {
				r = mid;
			}
		}
		return targetRange;
	}
}
