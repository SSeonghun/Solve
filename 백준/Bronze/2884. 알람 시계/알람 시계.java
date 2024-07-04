import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int M = m-45;

        if (M>=0) {
            System.out.println(h + " " + M);
        } else {
            if (h<1) {
                System.out.println((24+h-1) + " " + (M+60));
            } else {
                System.out.println((h-1) + " " + (M+60));
            }
        }
    }
}
