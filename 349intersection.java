class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> firsthashset = new HashSet<>();
            for (int num : nums1){
            firsthashset.add(num);
           }
           HashSet<Integer> finalhash = new HashSet<>();

            for (int num : nums2){
            if (firsthashset.contains(num)){
                finalhash.add(num);

            }
        }
        int[] result = new int[finalhash.size()];
        int i = 0;
        for (int num : finalhash){
            result[i++] = num;
        }
        return result;
        
    }
}
