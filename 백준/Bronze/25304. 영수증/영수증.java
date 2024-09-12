import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            String[] temps = br.readLine().split(" ");
            int a = Integer.parseInt(temps[0]);
            int b = Integer.parseInt(temps[1]);            
            total += a * b;
        }
        
        if (total == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
