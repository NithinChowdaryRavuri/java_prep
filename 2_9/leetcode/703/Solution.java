class KthLargest {

    private PriorityQueue<Integer> heap = new PriorityQueue<>();
    private int limit = 0;

    public KthLargest(int k, int[] nums) {
        this.limit = k;
        
        for(int num: nums){
            this.heap.add(num);
            if(this.heap.size() > k) heap.poll();
        }
    }
    
    public int add(int val) {
        this.heap.add(val);
        if(this.heap.size() > this.limit) heap.poll();
        return this.heap.peek();
    }
}