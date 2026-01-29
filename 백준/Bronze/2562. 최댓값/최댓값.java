// import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            // 한 줄씩 배열에 넣기
        }
        int maxIndex = 0;
        for (int i = 1; i < 9; i++) {
            // 앞 뒤 비교?
            // 전에 나온 최대값 보다 크면 갱신하게 하는 게 
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }
        System.out.println(arr[maxIndex]);
        System.out.println(maxIndex + 1);
        // 배열에서 그 인덱스값 바로 보는 거 뭐지?
        
    }
}