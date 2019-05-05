package arrayTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import array.SearchRange;

class SearchRangeTest {

	@Test
	void testSearchRange() {
		SearchRange sr = new SearchRange();
		int[] nums = {1,2,5,5,5,9};
		int target = 5;
		int[] targetRange = sr.searchRange(nums, target);
		assertEquals(2, targetRange[0]);
		assertEquals(4, targetRange[1]);
		int[] nums1 = {5,7,7,8,8,10};
		target = 8;
		targetRange = sr.searchRange(nums1, target);
		assertEquals(3, targetRange[0]);
		assertEquals(4, targetRange[1]);
		
		int[] nums2 = {5,7,7,8,8,10};
		target = 6;
		targetRange = sr.searchRange(nums2, target);
		assertEquals(-1, targetRange[0]);
		assertEquals(-1, targetRange[1]);
	}
}
