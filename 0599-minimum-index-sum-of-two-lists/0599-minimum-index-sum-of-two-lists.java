class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();

        // Store list1 strings with their indexes
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int minSum = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();

        // Check common strings in list2
        for (int j = 0; j < list2.length; j++) {

            if (map.containsKey(list2[j])) {

                int sum = map.get(list2[j]) + j;

                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(list2[j]);
                }
                else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
