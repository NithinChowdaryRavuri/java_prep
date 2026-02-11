class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = 
                    new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            maxHeap.add(stone);
        }

        while(maxHeap.size() > 1){
            int remaining = maxHeap.poll() - maxHeap.poll();
            if(remaining > 0) maxHeap.add(remaining);
        }

        if(maxHeap.size() == 1) return maxHeap.poll();
        return 0;
    }
}