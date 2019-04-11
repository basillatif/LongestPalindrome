class Solution {
    public int longestPalindrome(String s) {
        if(s == null)
            return 0;
        HashSet<Character> letters = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(letters.contains(s.charAt(i))){
                letters.remove(s.charAt(i));
                count++;
            }
            else{
                letters.add(s.charAt(i));
            }

        }
        if(!letters.isEmpty()) return count * 2 + 1;
        return count * 2;
    }
}
