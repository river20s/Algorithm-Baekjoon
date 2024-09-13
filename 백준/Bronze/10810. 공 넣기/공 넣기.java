import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);  // 바구니의 개수
        int m = Integer.parseInt(input[1]); // 공 넣을 방법 개수

        int[] baskets = new int[n]; // 바구니 배열

        for (int i = 0; i < m; i++) { // m번 입력 받음
            String[] temps = br.readLine().split(" ");
            int startNumber = Integer.parseInt(temps[0]) - 1; // 공 넣기 시작할 바구니 배열 인덱스
            int endNumber = Integer.parseInt(temps[1]) - 1; // 공 마지막으로 넣을 바구니 배열 인덱스
            int ballNumber = Integer.parseInt(temps[2]); // 넣을 공의 번호

            for (int j = startNumber; j <= endNumber; j++) { // 바구니 배열에 공 넣기
                baskets[j] = ballNumber;
            }
        }
        
        // 바구니 배열 요소 출력 (공백으로 구분)
        for (int i = 0; i < n; i++) {
            System.out.print(baskets[i]);
            if (i < n - 1) { // 마지막 요소가 아닌 경우에만 공백 추가
                System.out.print(" ");
            }
        }
    }
}
