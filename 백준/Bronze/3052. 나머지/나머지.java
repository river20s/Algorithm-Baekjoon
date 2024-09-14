import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] remainders = new boolean[42];
        int count = 0;
        
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            int remainder = number % 42;
            
            if (!remainders[remainder]) {
                remainders[remainder] = true;
                count++;
            }
        }
        
        System.out.println(count);
    }
}