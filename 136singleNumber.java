class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> myset = new HashSet<>();
        for (int x : nums){
            if(myset.contains(x)){
                myset.remove(x);
            }
            else
            {
                myset.add(x);
            }
        }
        return myset.iterator().next();
        
    }
}
