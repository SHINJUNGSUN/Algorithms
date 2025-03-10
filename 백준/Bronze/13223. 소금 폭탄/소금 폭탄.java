import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String et = sc.nextLine();

        String[] stArr = st.split(":");
        String[] etArr = et.split(":");

        int sHour = Integer.parseInt(stArr[0]) * 60 * 60;
        int sMinute = Integer.parseInt(stArr[1]) * 60;
        int sSecond = Integer.parseInt(stArr[2]);

        int eHour = Integer.parseInt(etArr[0]) * 60 * 60 + (24 * 60 * 60);
        int eMinute = Integer.parseInt(etArr[1]) * 60;
        int eSecond = Integer.parseInt(etArr[2]);

        int ans = (eHour + eMinute + eSecond) - (sHour + sMinute + sSecond);
        if(ans > (24 * 60 * 60)) ans -= (24 * 60 * 60);

        int hour = ans / (60 * 60);
        int minute = (ans % (60 * 60)) / 60;
        int second = (ans % (60 * 60)) % 60;

        System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
    }
}