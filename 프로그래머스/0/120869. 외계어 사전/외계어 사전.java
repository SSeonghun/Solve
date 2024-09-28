class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        
        for (String st : dic) {
            if (st.length()<spell.length){
                continue;
            }
            boolean flag = true;
            int[] arr = new int[26];
            for (String s : spell) {
                    char spellc = s.charAt(0);
                    arr[spellc-'a']++;
                }
            
            for (char c : st.toCharArray()) {

                for (String s : spell) {
                    char spellc = s.charAt(0);
                    if (c==spellc) {
                        arr[spellc-'a']--;
                    }
                }
            }
            for (int i : arr) {
                    if (i==1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return 1;
                }
        }
        
        return answer;
    }
}