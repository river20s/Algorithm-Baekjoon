import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);  // 바구니의 개수
        int m = Integer.parseInt(input[1]); // 공 교환 횟수
        
        // 바구니 배열 생성하기 
        int[] baskets = new int[n];
        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1;
        }
        
        for (int i = 0; i < m; i++) { // m번 입력 받음
            String[] temps = br.readLine().split(" ");
            int basketI = Integer.parseInt(temps[0]) - 1; // 교환할 바구니 i
            int basketJ = Integer.parseInt(temps[1]) - 1; // 교환할 바구니 j
            // i와 j 교환
            int temp = baskets[basketI];
            baskets[basketI] = baskets[basketJ];
            baskets[basketJ] = temp;
        }
               
        // 바구니 출력
        for (int i = 0; i < n; i++) {
            System.out.print(baskets[i]);
            if (i < n - 1) { 
                System.out.print(" ");
            }
        }
    }
}