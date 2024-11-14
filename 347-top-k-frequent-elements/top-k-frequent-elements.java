class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        pq.addAll(map.keySet());
        while (pq.size() > k) {
            pq.poll();
        }
        int[] arr = new int[k];
        for (int i = 0; !pq.isEmpty() && i < k; i++) {
            arr[i] = pq.poll();
        }
        return arr;
    }
}