package YandexFin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Four {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\4\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\4\\output.txt"));


        int tests = Integer.parseInt(reader.readLine());
        String[] split = reader.readLine().split(" ");
        Integer userLine = Integer.valueOf(split[0]);
        Integer car = Integer.valueOf(split[1]);

        System.out.println(tests + "  int tests");
        System.out.println(userLine + "  userLine");
        System.out.println(car + "  car");

        int[][] road = new int[userLine - 1][3];

        for (int i = 0; i < car; i++) {

            String[] str = reader.readLine().split(" ");
            Integer integer1 = Integer.parseInt(str[0]);
            Integer integer2 = Integer.valueOf(str[1]);
            System.out.println(integer1 + "  int " + integer2);

//            road[Integer.parseInt(str[1])][Integer.parseInt(str[0]) - 1] = -1;
            road[integer1 - 2][integer2 - 1] = 1;

        }
        System.out.println(Arrays.toString(road));
        for (int i = 0; i < road.length; i++) {
            for (int j = 0; j < road[i].length; j++) {
                System.out.print(road[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(Four.find(road) + " first way");

    }


    public static int find(int[][] road) {
        int z = 0;
        int zLeft = 0;
        while (true) {
            for (int i = 0; i < road.length; i++) {
                if (z == road.length){
                    return z;
                }
                if ((road[z][0] + road[z][1] + road[z][2]) == 3){
                    return z ;
                }

                if (road[z][1] != 1){
                    z++;
                } else if (road[z][0] == 0 && road[z][2] == 0) {
                    z++;
                    if (z == road.length) return z;

                    zLeft = z;
                    while (road[zLeft][0] == 0 && road[zLeft][1] != 0){
                        zLeft++;

                        if (zLeft == road.length){
                            return zLeft;
                        }
                    }
                    if (road[z][1] == 0){
                        z++;
                    }else {
                        while (road[z][2] == 0 && road[z][1] != 0){
                            z++;
                            if (z == road.length){
                                return z;
                            }
                        }
                    }
                    if (road[z][1] == 0){
                        z++;
                    }else {
                        return Math.max(zLeft, z);
                    }
                } else if (road[z][0] == 0) {
                    while (road [z][1] != 0){
                        z++;
                        if (road[z][0] == 1 && road[z][1] == 1){
                            return z;
                        }
                    }
                } else if (road[z][2] == 0) {
                    while (road[z][1] != 0){
                        z++;
                    }
                    if (road[z][2] == 1 && road[z][1] == 1){
                        return z;
                    }

                }
            }
        }


    }



}
