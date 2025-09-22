class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int x:nums)
            m.put(x,m.getOrDefault(x,0)+1);
        int max=0,sum=0;
        for(Map.Entry<Integer,Integer> x:m.entrySet())
        {
            int key=x.getKey();
            int val=x.getValue();
            if(val>max)
            {
                max=val;
                sum=val;
            }
            else if(val==max)
                sum+=val;
        }
        return sum;
    }
}