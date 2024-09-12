import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            String[] temps = br.readLine().split(" ");
            int a = Integer.parseInt(temps[0]);
            int b = Integer.parseInt(temps[1]);            
            int sum = a + b;
            
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        bw.flush();
    }
}
