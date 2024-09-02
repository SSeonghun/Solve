class Solution {
    public String[] solution(String[] picture, int k) {
        int len = picture.length;
        String[] answer = new String[len*k];
        int index = 0;
        
        for (int i=0; i<picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<picture[i].length(); j++) {
                for (int a=0; a<k; a++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            for (int j=0; j<k; j++) {
                answer[index++] = sb.toString();
            }
        }
        
        return answer;
    }
}