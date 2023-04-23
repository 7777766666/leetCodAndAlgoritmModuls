package YandexFin.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SendSetCars {



    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\4\\input1.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\4\\output.txt"));

//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));


        int tests = Integer.parseInt(reader.readLine());


        for (int j = 0; j < tests; j++) {

            String[] lineCar = reader.readLine().split(" ");
            int userLine = Integer.parseInt(lineCar[0]);
            int allCars = Integer.parseInt(lineCar[1]);


            int[][] road = new int[allCars][4];
            Set<Integer> carSet = new HashSet<>();

            for (int i = 0; i < allCars; i++) {

                String[] split = reader.readLine().split(" ");
                int line = Integer.parseInt(split[0]);
                int row = Integer.parseInt(split[1]);

                if (carSet.add(line)){
                    road[i][0] = line;
                    road[i][row] = -1;

                }else {
                    for (int k = 0; k < road.length; k++) {
                        if (road[k][0] == line ){
                            road[k][row] = -1;
                        }
                    }
                }


            }

            List<Integer> carList = new ArrayList<>(carSet);
            Collections.sort(carList);


            int check = check(road, userLine, allCars, carList);


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






    public static int check(int[][] road, int userLine, int allCars, List<Integer> carList) {

        if (userLine <= 1 || allCars < 3) {
            return userLine;
        }

        int l = 0;
        int m = 0;
        int r = 0;

        int l1;
        int m1;
        int r1;




        for (int i = 0; i < carList.size(); i++) {
            Integer index = carList.get(i);

            if (i == 0 || (  index - carList.get(i - 1)  != 1 ) ) {
                l = 0;
                m = 0;
                r = 0;
            }

            if (road[index][1] == 0 && (l == 0 || m == 0)) {
                l1 = 0;
            } else {
                l1 = -1;
            }

            if (road[index][2] == 0 ) {
                m1 = 0;
            } else {
                m1 = -1;
            }

            if (road[index][3] == 0 && (m == 0 || r == 0)) {
                r1 = 0;
            } else {
                r1 = -1;
            }

            if ((l1 + m1 + r1) == -3) {
                return index - 1;
            }

            l = l1;
            m = m1;
            r = r1;

        }
        return userLine;
    }

}