import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean flag = true;
            if (num==1) {
                flag = false;
            }
            for (int j=2; j<=Math.sqrt(num); j++) {
                if (num%j==0) {
                    flag = false;
                }
            }
            if (flag) {
                count ++;
            }
        }
        System.out.println(count);
    }
}