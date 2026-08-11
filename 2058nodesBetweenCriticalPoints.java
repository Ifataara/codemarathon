class Solution { 
    public int[] nodesBetweenCriticalPoints(ListNode head) { 
        // Edge case: need at least 3 nodes to have a critical point
        if(head == null || head.next == null || head.next.next == null){ 
            return new int[]{-1, -1}; 
        } 
        
        int count = 1; 
        ListNode prev = head; 
        ListNode curr = head.next; 
        List<Integer> criticalpoints = new ArrayList<>(); 
        
        while(curr.next != null){ 
            boolean isMaxima = curr.val > prev.val && curr.val > curr.next.val; 
            boolean isMinima = curr.val < prev.val && curr.val < curr.next.val; 
            
            if(isMaxima || isMinima){ 
                criticalpoints.add(count); 
            } 
            
            prev = curr; 
            curr = curr.next; 
            count = count + 1; 
        } 
        
        // If less than 2 critical points exist, return [-1, -1]
        if(criticalpoints.size() < 2){ 
            return new int[]{-1, -1}; 
        } 
        
        int maxDist = criticalpoints.get(criticalpoints.size() - 1) - criticalpoints.get(0); 
        int minDist = Integer.MAX_VALUE; 
        
        // Start loop from index 1 instead of 0 to avoid index -1 error
        for(int i = 1; i < criticalpoints.size(); i++){ 
            minDist = Math.min(minDist, criticalpoints.get(i) - criticalpoints.get(i - 1)); 
        } 
        
        return new int[]{minDist, maxDist}; 
    } 
}
