package arrayTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import array.RemoveDuplicates;

class RemoveDuplicatesTest {

	@Test
	void testRemoveDuplicates() {
		RemoveDuplicates rd = new RemoveDuplicates(); 
		int[] nums1 = {1,1,2};
		assertEquals(2, rd.removeDuplicates(nums1));
		assertEquals(1, nums1[0]);
		assertEquals(2, nums1[1]);
		int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
		assertEquals(5, rd.removeDuplicates(nums2));
		assertEquals(0, nums2[0]);
		assertEquals(1, nums2[1]);
		assertEquals(2, nums2[2]);
		assertEquals(3, nums2[3]);
		assertEquals(4, nums2[4]);
	}

}
