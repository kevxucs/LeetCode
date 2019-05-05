package array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
    	if (nums.length < 2) {
    		return nums.length;
    	} else {
    		int n = nums[0];
    		int size = nums.length;
    		int i = 1;

    		while(i < size) {
    			if (nums[i] == n) {
    				for (int j = i; j < size - 1; j++) {
    					nums[j] = nums[j + 1];
    				}
    				size--;
    			}else {
    				n = nums[i];
    				i++;
    			}
    		}
    		return size;
    	}
    }
}
