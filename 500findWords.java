class Solution {
    public String[] findWords(String[] words) {
        

        HashSet<Character> hash1 = new HashSet<>();
        HashSet<Character> hash2 = new HashSet<>();
        HashSet<Character> hash3 = new HashSet<>();

        for(char c : "qwertyuiop".toCharArray())
            hash1.add(c);

        for(char c : "asdfghjkl".toCharArray())
            hash2.add(c);

        for(char c : "zxcvbnm".toCharArray())
            hash3.add(c);

        List<String> ans = new ArrayList<>();

        for(String word : words){

            String str = word.toLowerCase();

            if(hash1.contains(str.charAt(0))){
                if(isPossible(str, hash1))
                    ans.add(word);
            }

            else if(hash2.contains(str.charAt(0))){
                if(isPossible(str, hash2))
                    ans.add(word);
            }

            else if(hash3.contains(str.charAt(0))){
                if(isPossible(str, hash3))
                    ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }

    public boolean isPossible(String str, HashSet<Character> hash){

        for(int i = 0; i < str.length(); i++){

            if(!hash.contains(str.charAt(i))){
                return false;
            }
        }

        return true;
    }
}
        
    
