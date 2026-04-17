class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()  != t.length())
            return false;

        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            smap.put(ch1, smap.getOrDefault(ch1, 0) + 1);

            char ch2 = t.charAt(i);
            tmap.put(ch2, tmap.getOrDefault(ch2, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: smap.entrySet()) {
            if(!tmap.containsKey(entry.getKey()) || !tmap.get(entry.getKey()).equals(entry.getValue()))
                return false;
        }
        return true;
    }
}
