class Solution {
    public String customSortString(String order, String s) {

        HashMap<Character, Integer> temp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            temp.put(ch, temp.getOrDefault(ch, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);

            if (temp.containsKey(ch)) {
                ans.append(Character.toString(ch).repeat(temp.get(ch)));
                temp.remove(ch);
            }
        }

        for (char ch : temp.keySet()) {
            ans.append(String.valueOf(ch).repeat(temp.get(ch)));
        }

        return ans.toString();
    }
}