import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] parts = br.readLine().split(" ");
        int currentHour = Integer.parseInt(parts[0]);
        int currentMinute = Integer.parseInt(parts[1]);

        int requiredTime = Integer.parseInt(br.readLine());
        
        int endMinute = currentMinute + requiredTime;
        int endHour = currentHour;
        

        if (endMinute >= 60) {
            endHour += endMinute / 60; 
            endMinute = endMinute % 60; 
        }
        

        if (endHour >= 24) {
            endHour = endHour % 24;
        }
        
        System.out.println(endHour + " " + endMinute);
    }
}
