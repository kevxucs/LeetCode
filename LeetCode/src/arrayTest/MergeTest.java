package arrayTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import array.Merge;

class MergeTest {

	@Test
	void testMerge() {
		Merge mr = new Merge();
		int [] nums1 = {1,2,3,0,0,0};
		int m = 3;
	    int[] nums2 = {2,5,6};      
	    int n = 3;
	    mr.merge(nums1, m, nums2, n);
	    assertEquals(1, nums1[0]);
		assertEquals(2, nums1[1]);
		assertEquals(2, nums1[2]);
		assertEquals(3, nums1[3]);
		assertEquals(5, nums1[4]);
		assertEquals(6, nums1[5]);
	}

}
