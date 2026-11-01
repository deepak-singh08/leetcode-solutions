class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        findCombinations(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    public void findCombinations(int[] candidates, int target, int index,
                                 List<Integer> current,
                                 List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        // Pick the current element
        current.add(candidates[index]);

        findCombinations(candidates, target - candidates[index],
                         index, current, result);

        // Backtrack (remove the last element)
        current.remove(current.size() - 1);

        // Skip the current element
        findCombinations(candidates, target, index + 1,
                         current, result);
    }
}
    