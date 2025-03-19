import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] box = reader.readLine().split(" ");
            String[] current = reader.readLine().split(" ");
            String count = reader.readLine();
            int W = Integer.parseInt(box[0]);
            int H = Integer.parseInt(box[1]);
            int P = Integer.parseInt(current[0]);
            int Q = Integer.parseInt(current[1]);
            int T = Integer.parseInt(count);

            int currentX = (T + P) % (2 * W);
            int currentY = (T + Q) % (2 * H);
            if (currentX > W) currentX = 2 * W - currentX;
            if (currentY > H) currentY = 2 * H - currentY;

            System.out.println(currentX + " " + currentY);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}