class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for (int i=0; i<db.length; i++) {
            if (db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1])) {
                return "login";
            } else if (db[i][0].equals(id_pw[0])) {
                answer = "wrong pw";
            } else if (!answer.equals("wrong pw") && db[i][1].equals(id_pw[1])) {
                answer = "fail";
            }
        }
        
        return answer;
    }
}