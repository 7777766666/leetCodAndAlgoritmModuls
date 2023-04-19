package YandexFin.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\4\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\4\\output.txt"));

        int tests = Integer.parseInt(reader.readLine());

        for (int i = 0; i < tests; i++) {

            String[] split = reader.readLine().split(" ");
            int userLine = Integer.parseInt(split[0]);
            int cars = Integer.parseInt(split[1]);

            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int j = 0; j < cars; j++) {
                String[] carLine = reader.readLine().split(" ");
                int line = Integer.parseInt(carLine[0]);
                int car = Integer.parseInt(carLine[1]);

                if (map.containsKey(line)) {
                    // ключ key есть в матрице
                    List<Integer> values = map.get(line);
                    values.add(car);
                    // использование списка значений для ключа key
                } else {
                    // ключ key отсутствует в матрице
                    List<Integer> newValues = new ArrayList<>();
                    newValues.add(car);
                    map.put(line, newValues);
                }
            }
            for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                int key = entry.getKey();
                List<Integer> values = entry.getValue();
                System.out.println("Key: " + key + " Values: " + values);
            }

            System.out.println("------------------------------------------");
        }

        int l = 0;
        int m = 0;
        int r = 0;

    }
}

