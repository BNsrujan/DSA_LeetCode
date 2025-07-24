

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(candidates, 0, result, combination, target);
        return result;
    }

    public void backtrack(int[] candidates, int i, List<List<Integer>> result, List<Integer> combination, int target) {
        if (target < 0 || i >= candidates.length) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        // Include current candidate
        combination.add(candidates[i]);
        backtrack(candidates, i, result, combination, target - candidates[i]); // pick same element again
        combination.remove(combination.size() - 1); // backtrack

        // Exclude current candidate
        backtrack(candidates, i + 1, result, combination, target); // move to next element
    }
}
