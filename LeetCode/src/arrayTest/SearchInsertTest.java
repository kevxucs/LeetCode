package arrayTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import array.SearchInsert;

class SearchInsertTest {

	@Test
	void testSearchInsert() {
		SearchInsert si = new SearchInsert();
		int[] nums = {1,3,5,6};
		int target = 5;
		assertEquals(2, si.searchInsert(nums, target));
		int[] nums1 = {1,3,5,6};
		target = 2;
		assertEquals(1, si.searchInsert(nums1, target));
		target = 7;
		assertEquals(4, si.searchInsert(nums1, target));
		target = 0;
		assertEquals(0, si.searchInsert(nums1, target));
	}

}
