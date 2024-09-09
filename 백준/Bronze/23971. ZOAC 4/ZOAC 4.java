import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);
        int M = Integer.parseInt(input[3]);
        
        int row = (H + N) / (N + 1);
        int col = (W + M) / (M + 1);
        
        int max = row * col;
        
        System.out.println(max);
       
        
    }
    
    
    
}