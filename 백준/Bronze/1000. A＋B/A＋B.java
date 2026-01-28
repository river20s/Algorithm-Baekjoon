import java.util.*; //StringTokenizer
import java.io.*;

// BufferedReader vs Scanner
// * BufferedReader는 스트림을 감싸서 버퍼(임시 저장소)에 모아뒀다가 한 줄 씩 읽게 해줌
// * InputStreamReader(System.in) -> 바이트를 문자로 변환
// 키보드 -> System.in (바이트) -> InputStreamReader(문자) -> BufferedReader(줄 단위)
// 토큰: 문자열을 특정 기준으로 쪼갠 조각

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in); // System.in -> 키보드로부터 들어오는 입력 스트림, 바이트 단위로 들어옴
        // int a = sc.nextInt(); // Scanner는 공백을 자동으로 구분하니까 그냥 두 번 호출하면 됨
        // int b = sc.nextInt();
        // System.out.println(a + b);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // ST는 문자열을 토큰으로 쪼개주는 도구, 
        // 구분자 지정이 가능함 
        // BR는 줄 단위로 읽어서 직접 공백 구분해야 함
        // nextToken() -> 공백 기준 잘라서 가져옴
        // 키보드 입력 -> InputStream -> 프로그램
        // 프로그램 -> OutputStream -> 화면 출력
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(a+b);
        
        
    }
}