import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Scanner는 공백을 자동으로 구분하니까 그냥 두 번 호출하면 됨
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}