import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double Sum = 0;
        double[] arr = new double[N];
        double Max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
            if (Max<n) {
                Max = n;
            }
        }

        for (int i=0; i<N; i++) {
            Sum += ((arr[i] / Max) * 100);
        }
        System.out.println(Sum/N);
    }
}
