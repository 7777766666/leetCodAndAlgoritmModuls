package YandexFin.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class DelSout {



    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\4\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\4\\output.txt"));


//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

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
                    cars[car - 1] = 1;
                    map.put(key, cars);
                } else {
                    int[] newCar = new int[3];
                    newCar[car - 1] = 1;

                    map.put(key, newCar);
                }


            }

            int check = check(map, userLine, allCars);


            if (tests - j == 1){
                writer.write(String.valueOf(check));
            }else {
                writer.write(String.valueOf(check));
                writer.newLine();
            }



        }
        writer.close();
        reader.close();
    }

    public static int check(Map<Integer, int[] > map, int userLine, int allCars){

        if (userLine <= 1 || allCars < 3){
            return userLine;
        }

        Set<Integer> allKeys = map.keySet();
        Integer max = Collections.max(allKeys);

        int l = 0;
        int m = 0;
        int r = 0;


        for (Map.Entry<Integer, int[] > xxx : map.entrySet() ) {
            int[] value = xxx.getValue();

            if (value[0] == 1){
                l = 1;
            }else {
                if (l == 0 || m == 0){
                    l = 0;
                }
            }
            if (value[2] == 1){
                r = 1;
            }else {
                if (m == 0 || r == 0){
                    r = 0;
                }
            }
            if (value[1] == 1){
                m = 1;
            }else {
                m = 0;
            }
            if ((l + m + r) == 3){
                return (xxx.getKey() - 1);
            }
            if (!Objects.equals(max, xxx.getKey()) && map.containsKey(xxx.getKey() + 1) == false){
                l = 0;
                m = 0;
                r = 0;
            }
            if (Objects.equals(max, xxx.getKey())){
                return userLine;
            }


        }
        return userLine;
    }


}

