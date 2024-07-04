import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];


        for (int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            }
        int count = 0;
        int max = -2100000;

        for (int i=0; i<9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = i;
            }
        }
        System.out.println(max);
        System.out.println(count+1);

    }
}
