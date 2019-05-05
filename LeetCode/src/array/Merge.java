package array;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; 
        int j = 0;
        int[] nums = new int[n + m]; 
        while(i < m && j < n) {
        	if (nums1[i] <= nums2[j]) {
        		nums[i+j] = nums1[i];
        		i++;
        	} else {
        		nums[i+j] = nums2[j];
        		j++;
        	}
        }
        while(i < m) {
    		nums[i+j] = nums1[i];
    		i++;
        }
        while(j < n) {
    		nums[i+j] = nums2[j];
    		j++;
        }
        for(i = 0; i < nums.length; i++) {
        	nums1[i] = nums[i];
        }
    }
}
