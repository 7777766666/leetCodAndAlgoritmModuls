package YandexFin.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ArrFour {



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

            for (int i = 0; i < road.length; i++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(road[i][k] + " ");
                }
                System.out.println();

            }

            System.out.println("---------------------");
            int t = 0;
            int[][] cleanRoad = new int[carSet.size()][4];
            for (int i = 0; i < road.length; i++) {
                if (road[i][0] != 0){
                    cleanRoad[t][0] = road[i][0];
                    cleanRoad[t][1] = road[i][1];
                    cleanRoad[t][2] = road[i][2];
                    cleanRoad[t++][3] = road[i][3];
                }
            }

            for (int i = 0; i < cleanRoad.length; i++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(cleanRoad[i][k] + " ");
                }
                System.out.println();
            }


            System.out.println("--------------------------------------");

            int[][] quickSort = quickSort(cleanRoad, 0, cleanRoad.length - 1);
            int check = check(quickSort, userLine, allCars);
            System.out.println(check + " line return");
            System.out.println("--------------------------------------");

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




    public static int check(int[][] cleanRoad, int userLine, int allCars) {

        if (userLine <= 1 || allCars < 3) {
            return userLine;
        }

        int l = 0;
        int m = 0;
        int r = 0;

        int l1;
        int m1;
        int r1;



        for (int i = 0; i < cleanRoad.length; i++) {

            if (i == 0 || (cleanRoad[i][0] - cleanRoad[i - 1][0] != 1 ) ) {
                l = 0;
                m = 0;
                r = 0;
            }




            if (cleanRoad[i][1] == 0 && (l == 0 || m == 0)) {
                l1 = 0;
            } else {
                l1 = -1;
            }

            if (cleanRoad[i][2] == 0 ) {
                m1 = 0;
            } else {
                m1 = -1;
            }

            if (cleanRoad[i][3] == 0 && (m == 0 || r == 0)) {
                r1 = 0;
            } else {
                r1 = -1;
            }

            if ((l1 + m1 + r1) == -3) {
                return (cleanRoad[i][0] - 1);
            }

            l = l1;
            m = m1;
            r = r1;

        }
        return userLine;
    }

    public static int[][] quickSort(int[][] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
        return arr;
    }

    public static int partition(int[][] arr, int left, int right) {
        int pivotValue = arr[right][0];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j][0] < pivotValue) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}