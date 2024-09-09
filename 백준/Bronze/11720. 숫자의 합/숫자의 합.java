import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += numbers.charAt(i) - '0';
        }
        
        System.out.println(sum);
    }
}
