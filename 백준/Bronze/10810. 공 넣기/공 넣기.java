import java.util.*;
import java.io.*;
/* 바구니
[1] [2] [1] [1] [0]
 1   2   3   4   5
배열을 갱신하는?
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] b = new int[n]; // 바구니
        
        /* 선언시 자동으로 0으로 초기화됨
        for (i = 0; i < n; i++) {
            // 일단 다 0으로 초기화
            b[i] = 0;
        }
        */
        
        for (int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); // 시작 바구니 번호
            int j = Integer.parseInt(st.nextToken()); // 끝 바구니 번호
            int k = Integer.parseInt(st.nextToken()); // 넣을 공
            
            for (int idx = i - 1; idx <= j - 1; idx++) {
                b[idx] = k;
            }
        }
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < n; q++) {
            sb.append(b[q]);
            if (q < n - 1) sb.append(" ");
        }
        System.out.println(sb);
    }
}
