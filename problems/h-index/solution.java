class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0, N = citations.length;
        
        // condition 1: h of her N papers have at least h citations
        // condition 2: the other N − h papers have no more than h citations each
        for(int i = 0; i < N; i++) {
            
            int maxH = N-i;
            
            h = (citations[i] >= maxH && maxH > h ) ? maxH : h;
            //h = (citations[i] >= i+1 && i >= h && N-p >= p ) ?  i : h;
                


            
        } 
                
        return h;
    }
}