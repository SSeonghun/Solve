import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int total = (1<<10)-1;

        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());

            int visited = 0;
            int idx = 1;

            while (visited != total) {
                String str = String.valueOf(n * idx);

                for (char c : str.toCharArray()) {
                    int num = c - '0';
                    visited |= (1 << num);
                }

                idx++;
            }
            System.out.println("#" + (i+1) + " " + (n * (idx - 1)));
        }
    }
}
