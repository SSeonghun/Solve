import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        
        for (int i=0; i<st.length(); i++) {
            System.out.println(st.charAt(i));
        }
    }
}