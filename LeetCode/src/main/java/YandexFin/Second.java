package YandexFin;


import java.io.*;

public class Second {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        String[] spit = reader.readLine().split(" ");
        int n = Integer.parseInt(spit[0]);
        int meet = Integer.parseInt(spit[1]);
        String[] myTime = reader.readLine().split("-");
        int start = convertToMinutes(myTime[0]);
        int end = convertToMinutes(myTime[1]);
        int[] busy = new int[24 * 60]; // массив, где busy[i] = 1, если время i занято, и 0 иначе
        for (int i = 0; i < meet; i++) {
            String[] meeting = reader.readLine().split(" ");
            int member = Integer.parseInt(meeting[0]) - 1; // уменьшаем на 1, чтобы индексация начиналась с 0
            String[] times = meeting[1].split("-");
            int startMins = convertToMinutes(times[0]);
            int endMins = convertToMinutes(times[1]);
            for (int j = startMins; j < endMins; j++) {
                busy[j] |= (1 << member); // установка бита в busy[j] для участника member
            }
        }
        int maxFreeStart = -1;
        int maxFreeEnd = -1;
        int maxFreeDuration = 0;
        int currentFreeStart = -1;
        int currentFreeEnd = -1;
        int currentFreeDuration = 0;
        for (int i = start; i < end; i++) {
            if (busy[i] == 0) {
                // свободный интервал продолжается
                if (currentFreeStart == -1) {
                    currentFreeStart = i;
                }
                currentFreeEnd = i + 1;
                currentFreeDuration++;
            } else {
                // свободный интервал закончился
                if (currentFreeDuration > maxFreeDuration) {
                    maxFreeStart = currentFreeStart;
                    maxFreeEnd = currentFreeEnd;
                    maxFreeDuration = currentFreeDuration;
                }
                currentFreeStart = -1;
                currentFreeEnd = -1;
                currentFreeDuration = 0;
            }
        }
        if (currentFreeDuration > maxFreeDuration) {
            maxFreeStart = currentFreeStart;
            maxFreeEnd = currentFreeEnd;
            maxFreeDuration = currentFreeDuration;
        }
        if (maxFreeDuration == 0) {
            writer.write("ALARM");
        } else {
            writer.write(convertToTime(maxFreeStart) + "-" + convertToTime(maxFreeEnd));
        }
        reader.close();
        writer.close();
    }

    private static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    private static String convertToTime(int minutes) {
        int hours = minutes / 60;
        int mins = minutes % 60;
        return String.format("%02d:%02d", hours, mins);
    }
}
