import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // Scanner sc = new Scanner(System.in);
        
        // float: 유효숫자 6~7자리(오차수준 10^(-7)),
        // double: 유효숫자 15~16자리(오차수준 10^(-16))
        
        // double a = sc.nextDouble();
        // double b = sc.nextDouble();
        
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        System.out.println(a / b);
    
    }
}