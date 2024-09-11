import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<10; i++) {
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            ArrayList<Integer> original = new ArrayList<>();
            for (int j=0; j<n; j++) {
                original.add(Integer.parseInt(st.nextToken()));
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int j=0; j<m; j++) {
                String str = st.nextToken();
                if (str.equals("I")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());

                    for (int k = 0; k < y; k++) {
                        int s = Integer.parseInt(st.nextToken());
                        original.add(x++, s);
                    }
                } else if (str.equals("D")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());

                    for (int k = 0; k < y; k++) {
                        original.remove(x);
                    }
                } else if (str.equals("A")) {
                    int y = Integer.parseInt(st.nextToken());

                    for (int k = 0; k < y; k++) {
                        int s = Integer.parseInt(st.nextToken());
                        original.add(s);
                    }
                }
            }

            for(int j =0; j<10; j++) {
                sb.append(" " + original.get(j));
            }

            System.out.println("#" + (i + 1) + sb);
        }
    }
}