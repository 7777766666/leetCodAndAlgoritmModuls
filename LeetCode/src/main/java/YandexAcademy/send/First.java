package YandexAcademy.send;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class First {
    public static void main(String[] args) throws IOException {


//        BufferedReader reader = new BufferedReader(new FileReader("E:\\4\\1\\input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\4\\1\\output.txt"));

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String[] split = reader.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int q = Integer.parseInt(split[2]);

        int[] all = new int[n + 1];
        int[] resetIndex = new int[n + 1];
        Map<Integer, int[]> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < q; i++) {

            String[] action = reader.readLine().split(" ");
            String someAction = action[0];

            if (someAction.equals("DISABLE")) {
                int dataC = Integer.parseInt(action[1]);
                int numS = Integer.parseInt(action[2]);
                if (map.containsKey(dataC)) {
                    int[] value = map.get(dataC);
                    if (value[numS] == 0) {
                        all[dataC] += 1;
                    }
                } else {
                    int[] value = new int[m + 1];
                    value[numS] = -1;
                    map.put(dataC, value);
                    all[dataC] += 1;
                }

            } else if (someAction.equals("RESET")) {
                int reset = Integer.parseInt(action[1]);
                all[reset] = 0;
                resetIndex[reset] += 1;
                map.put(reset, new int[m + 1]);
            } else if (someAction.equals("GETMAX")) {
                int getMax = -1;
                int index = -1;
                for (int j = 1; j < all.length; j++) {
                    int max = resetIndex[j] * (m - all[j]);
                    if (getMax < max) {
                        getMax = max;
                        index = j;
                    }
                }
                result.add(index);

            } else {
                int getMin = 2_147_000_000;
                int index = -1;
                for (int j = 1; j < all.length; j++) {
                    int min = resetIndex[j] * (m - all[j]);
                    if (getMin > min) {
                        getMin = min;
                        index = j;
                    }
                }
                result.add(index);

            }
        }



        for (int i = 0; i < result.size() - 1; i++) {
            writer.write(String.valueOf(result.get(i)));
            writer.newLine();
        }
        writer.write(String.valueOf(result.get(result.size() - 1)));

        writer.close();
        reader.close();
    }
}
