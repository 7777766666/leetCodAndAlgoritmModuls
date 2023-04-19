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

public class Test4 {


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\4\\input1.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\4\\output.txt"));


//            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));


        int test = Integer.parseInt(reader.readLine());
        System.out.println(test);

        for (int i = 0; i < test; i++) {


            String[] split = reader.readLine().split(" ");
            int userLine = Integer.parseInt(split[0]);
            int cars = Integer.parseInt(split[1]);
            System.out.println(userLine);
            System.out.println(cars);

            int zMax = -1;


                int z = 0;
                int l = 0;
                int m = 0;
                int r = 0;

                while (cars > 0) {

                    Map<Integer, List<Integer>> map = new HashMap<>();
                    String[] car = reader.readLine().split(" ");
                    int key = Integer.parseInt(car[0]);
                    if (!map.containsKey(key)) {
                        List<Integer> values = new ArrayList<>();
                        values.add(Integer.parseInt(car[1]));
                        map.put(key, values);
                    } else {
                        List<Integer> values = map.get(key);
                        values.add(Integer.parseInt(car[1]));
                        map.put(key, values);
                    }
                    cars--;

                }
            }


        }


    }
//        writer.close();






