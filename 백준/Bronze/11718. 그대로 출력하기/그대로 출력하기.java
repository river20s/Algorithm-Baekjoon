import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder result = new StringBuilder();
        int lineCount = 0;
        
        while ((line = br.readLine()) != null && !line.isEmpty() && lineCount < 100) {
            result.append(line).append("\n");
            lineCount++;
        }
        
        System.out.print(result.toString());
    }
}
