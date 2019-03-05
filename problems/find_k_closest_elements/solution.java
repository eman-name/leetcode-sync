class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++) list.add(arr[i]);
        
        Collections.sort(list, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
        list = list.subList(0, k);
        Collections.sort(list);
        return list; 
    }
}