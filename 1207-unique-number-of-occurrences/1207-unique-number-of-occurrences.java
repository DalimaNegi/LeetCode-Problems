class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) +1 ); 
            }
            else{
                map.put(arr[i] ,1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int v : map.values()){
            if(set.contains(v)){
                return false;
            }
            else{
                set.add(v);
            }
        }
        return true;
    }
}