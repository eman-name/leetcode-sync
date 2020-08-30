class Solution {
    
    // O(2n)
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> mostCandiesPossible = new ArrayList<>(candies.length);
        int max = candies[0];
        for(int candy : candies) max = (candy > max) ? candy : max;
        for(int candy : candies) mostCandiesPossible.add(extraCandies + candy >= max);
        return mostCandiesPossible;
    }
}