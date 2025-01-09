class Solution {
    public boolean areOccurrencesEqual(String s) {

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Get the frequency of the first character
        int frequency = map.get(s.charAt(0));

        // Check if all characters have the same frequency
        for (char key : map.keySet()) {
            if (map.get(key) != frequency) {
                return false;
            }
        }
        return true;
    }
}
