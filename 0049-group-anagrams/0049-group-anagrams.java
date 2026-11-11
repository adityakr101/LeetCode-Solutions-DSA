class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            int[] count=new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i:count){
                sb.append("#");
                sb.append(i);
            }
            String key=sb.toString();
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<String>());
            }
            hm.get(key).add(s);
        }
        return new ArrayList(hm.values());
    }
}