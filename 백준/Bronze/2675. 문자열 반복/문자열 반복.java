import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] p = new String[t];
        
        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            String[] parts = input.split(" ");
            int r = Integer.parseInt(parts[0]);
            String s = parts[1];
            
            StringBuilder result = new StringBuilder();
            
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                for (int k = 0; k < r; k++) {
                    result.append(ch);
                }
            }
            p[i] = result.toString();
        }
        for (String line : p) {
            System.out.println(line);
        }
    }
}