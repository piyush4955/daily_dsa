class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        Set<Character> s = new HashSet<>();
        for(int i = 0; i<word.length(); i++){
            s.add(word.charAt(i));
        }

        List<Character> list = new ArrayList<>(s);
        for(int i = 0; i<list.size(); i++){
            for(int j = i; j<list.size(); j++){
                if(list.get(i)-list.get(j)==32||list.get(i)-list.get(j)==-32){
                    count++;
                }
            }
        }
        return count;
    }
}