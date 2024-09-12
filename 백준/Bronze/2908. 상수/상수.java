import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        String[] numbers = input.split(" ");
        
        int a = Integer.parseInt(new StringBuilder(numbers[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(numbers[1]).reverse().toString());
        
        int largerNumber = Math.max(a, b);
        System.out.println(largerNumber);
        
    }
}
