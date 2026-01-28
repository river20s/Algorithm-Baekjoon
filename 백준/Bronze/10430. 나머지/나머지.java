import java.util.*;
import java.io.*;

public class Main {
    
    public static int[] addMod(int a, int b, int c) {
        int direct = (a + b) % c;
        int distributed = ((a % c) + (b % c)) % c;
        return new int[]{direct, distributed};
    }
    
    public static int[] mulMod(int a, int b, int c) {
        int direct = (a * b) % c;
        int distributed = ((a % c) * (b % c)) % c;
        return new int[]{direct, distributed};
    }
    
    
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int[] addResult = addMod(a, b, c);
        int[] mulResult = mulMod(a, b, c);
        
        System.out.println(addResult[0]);
        System.out.println(addResult[1]);
        System.out.println(mulResult[0]);
        System.out.println(mulResult[1]);
        
    }
}