class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int i : candyType)
        {
            set.add(i);
        }
        int b = candyType.length/2;
        if(set.size()>=b)
        {
            return b;
        }
        else 
        {
            return set.size();
        }

    }
}