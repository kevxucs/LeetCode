package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack(result, new ArrayList<Integer>(), candidates, target, 0);
		return result;
	}

	private static void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int[] candidates,
			int remainingTarget, int start) {
		if (remainingTarget < 0) {
			return;
		} else if (remainingTarget == 0) {
			resultList.add(new ArrayList<>(tempList));
		} else {
			for (int i = start; i < candidates.length; i++) {
				tempList.add(candidates[i]);
				backtrack(resultList, tempList, candidates, remainingTarget - candidates[i], i);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
