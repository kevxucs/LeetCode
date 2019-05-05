package arrayTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import array.TwoSum;

class TwoSumTest {

	@Test
	void testTwoSum() {
		TwoSum ts = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = ts.twoSum(nums, target);
		assertEquals(0, result[0]);
		assertEquals(1, result[1]);
	}

}
