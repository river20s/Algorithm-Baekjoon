import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] pips = br.readLine().split(" ");
        int pip1 = Integer.parseInt(pips[0]);
        int pip2 = Integer.parseInt(pips[1]);
        int pip3 = Integer.parseInt(pips[2]);
        
        int winning;
        
        if (pip1 == pip2 && pip2 == pip3) {
            winning = pip1 * 1000 + 10000;
        } else if (pip1 == pip2) {
            winning = pip1 * 100 + 1000;
        } else if (pip2 == pip3) {
            winning = pip2 * 100 + 1000;
        } else if (pip3 == pip1) {
            winning = pip3 * 100 + 1000;
        } else {
            int max = Math.max(pip1, Math.max(pip2, pip3));
            winning = max * 100;
        }
    
        System.out.println(winning);
    }
}
