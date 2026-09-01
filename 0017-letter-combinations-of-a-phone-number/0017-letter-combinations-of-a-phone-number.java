class Solution {
    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return letterCombinationsHelper("", digits);
    }

    private List<String> letterCombinationsHelper(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        String letters = KEYPAD[digit];
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(letterCombinationsHelper(p + ch, up.substring(1)));
        }
        return list;
    }
}