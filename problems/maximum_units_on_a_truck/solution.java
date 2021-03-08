class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
     
        int[] bin = new int[1001];
        
        for(int[] i : boxTypes) bin[i[1]] += i[0];

        int units = 0;
        int boxes = 0;
        
        for(int i = bin.length-1; i > 0; i--) {
            
            int numberOfBoxes = bin[i];
            int numberOfUnitsPerBox = i;
            
            while(numberOfBoxes > 0) {
                if( (boxes + numberOfBoxes) <= truckSize) {
                    boxes += numberOfBoxes;
                    units += numberOfBoxes * numberOfUnitsPerBox;
                    break;
                } else numberOfBoxes--;
            }
        }
        
        return units;
    }
    
    
}