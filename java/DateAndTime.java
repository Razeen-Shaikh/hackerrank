import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING. The function accepts following
     * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        HashMap<Integer, Integer> monthCode = new HashMap<Integer, Integer>() {
            /**
             *
             */
            private static final long serialVersionUID = -557984129348871849L;

            {
                put(1, 0);
                put(2, 3);
                put(3, 3);
                put(4, 6);
                put(5, 1);
                put(6, 4);
                put(7, 6);
                put(8, 2);
                put(9, 5);
                put(10, 0);
                put(11, 3);
                put(12, 5);
            }
        };
        String[] weekDay = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        HashMap<Integer, Integer> centCode = new HashMap<Integer, Integer>() {
            /**
             *
             */
            private static final long serialVersionUID = -9128936185134724465L;

            {
                put(20, 6);
                put(21, 4);
                put(22, 2);
                put(23, 0);
                put(24, 6);
                put(25, 4);
                put(26, 2);
                put(27, 0);
                put(28, 6);
                put(29, 4);
                put(30, 2);
            }
        };
        int YY = year % 100;
        int yearCode = (YY + YY / 4) % 7;
        int y = year / 100;
        int leapYear = 0;
        int Wd = 0;
        if (month == 1 || month == 2) {
            if (year % 4 == 0) {
                leapYear = 1;
                if (year % 100 == 0) {
                    leapYear = 0;
                    if (year % 400 == 0) {
                        leapYear = 1;
                    }
                }
            }
        }
        Wd = (yearCode + monthCode.get(month) + centCode.get(y) + day - leapYear) % 7;
        return weekDay[Wd];
    }
}

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
