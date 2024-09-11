import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            String answer;

            int lastBit = (1<<n)-1;

            if (lastBit == (m&lastBit)) {
                answer = "ON";
            } else {
                answer = "OFF";
            }

            System.out.println("#" + (i+1) + " " + answer);
        }
    }
}
