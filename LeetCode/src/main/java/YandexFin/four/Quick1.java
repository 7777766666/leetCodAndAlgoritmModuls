package YandexFin.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Quick1 {

    public static void main(String[] args) throws IOException {



        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        int tests = Integer.parseInt(reader.readLine());


        for (int j = 0; j < tests; j++) {

            String[] lineCar = reader.readLine().split(" ");
            int userLine = Integer.parseInt(lineCar[0]);
            int allCars = Integer.parseInt(lineCar[1]);


            Map<Integer, int[]> map = new HashMap<>();

            for (int i = 0; i < allCars; i++) {

                String[] split = reader.readLine().split(" ");
                int key = Integer.parseInt(split[0]);
                int car = Integer.parseInt(split[1]);


                if (map.containsKey(key)) {
                    int[] cars = map.get(key);
                    cars[car - 1] = -1;
                    map.put(key, cars);
                } else {
                    int[] newCar = new int[3];
                    newCar[car - 1] = -1;

                    map.put(key, newCar);
                }


            }

            Map<Integer, int[]> sortedMap = new TreeMap<>(map);

            int check = check(sortedMap, userLine, allCars);


            if (tests - j == 1) {
                writer.write(String.valueOf(check));
            } else {
                writer.write(String.valueOf(check));
                writer.newLine();
            }


        }
        writer.close();
        reader.close();
    }

    public static int check(Map<Integer, int[]> map, int userLine, int allCars) {

        if (userLine <= 1 || allCars < 3) {
            return userLine;
        }

        int l = -1;
        int m = 0;
        int r = -1;

        int l1 = -1;
        int m1 = -1;
        int r1 = -1;


        for (Map.Entry<Integer, int[]> xxx : map.entrySet()) {

            if (map.get(xxx.getKey() - 1) == null) {
                l = -1;
                m = 0;
                r = -1;
            }

            int[] value = xxx.getValue();


            if (value[1] == 0) {
                m1 = 0;
                l1 = -1;
                r1 = -1;
            } else if (value[0] == 0 || value[2] == 0) {
                m1 = -1;
                if (value[0] == 0 && (l == 0 || m ==0)){
                    l1 = 0;
                }else {
                    l1 = -1;
                }
                if (value[2] == 0 && (m ==0 || r == 0)){
                    r1 = 0;
                   }else {
                    r1 = -1;
                }
            }else {
                return (xxx.getKey() - 1);
            }

            if (l1 + m1 + r1 == -3){
                return (xxx.getKey() - 1);
            }


            l = l1;
            m = m1;
            r = r1;

        }
        return userLine;
    }

}
