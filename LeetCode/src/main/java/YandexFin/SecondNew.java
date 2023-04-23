package YandexFin;

import java.io.*;

public class SecondNew {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        String[] spit = reader.readLine().split(" ");
        int meet = Integer.parseInt(spit[1]);
        String[] myTime = reader.readLine().split("-");
        int start = toMinuts(myTime[0]);
        int end = toMinuts(myTime[1]);
        int[] busy = new int[24 * 60];
        for (int i = 0; i < meet; i++) {
            String[] meeting = reader.readLine().split(" ");
            int member = Integer.parseInt(meeting[0]) - 1;
            String[] times = meeting[1].split("-");
            int startMins = toMinuts(times[0]);
            int endMins = toMinuts(times[1]);
            for (int j = startMins; j < endMins; j++) {
                busy[j] |= (1 << member);
            }
        }
        int maxStart = -1;
        int maxEnd = -1;
        int maxFreeTime = 0;
        int currentFreeStart = -1;
        int currentFreeEnd = -1;
        int currentFreeTime = 0;
        for (int i = start; i < end; i++) {
            if (busy[i] == 0) {
                if (currentFreeStart == -1) {
                    currentFreeStart = i;
                }
                currentFreeEnd = i + 1;
                currentFreeTime++;
            } else {

                if (currentFreeTime > maxFreeTime) {
                    maxStart = currentFreeStart;
                    maxEnd = currentFreeEnd;
                    maxFreeTime = currentFreeTime;
                }
                currentFreeStart = -1;
                currentFreeEnd = -1;
                currentFreeTime = 0;
            }
        }
        if (currentFreeTime > maxFreeTime) {
            maxStart = currentFreeStart;
            maxEnd = currentFreeEnd;
            maxFreeTime = currentFreeTime;
        }
        if (maxFreeTime == 0) {
            writer.write("ALARM");
        } else {
            writer.write(toTime(maxStart) + "-" + toTime(maxEnd));
        }
        reader.close();
        writer.close();
    }

    private static int toMinuts(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    private static String toTime(int minutes) {
        int hours = minutes / 60;
        int mins = minutes % 60;
        return String.format("%02d:%02d", hours, mins);
    }
}
