class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            int sum = target - nums[i];
            if(hmap.containsKey(sum)){
                return new int[]{i,hmap.get(sum)};
            }
            else{
                hmap.put(nums[i],i);
            }

        }
        return new int[]{-1,-1};
        
    }
}