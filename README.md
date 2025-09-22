# September22_2025
The problem that i solved today in leetcode

You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

Code:
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
