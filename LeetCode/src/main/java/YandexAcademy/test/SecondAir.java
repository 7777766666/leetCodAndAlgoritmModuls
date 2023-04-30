package YandexAcademy.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SecondAir {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        int[][] left = new int[0][];
        int[][] right = new int[0][];

        try (BufferedReader reader = new BufferedReader(new FileReader("E:\\4\\test\\2\\input.txt"))  ) {



        int row = Integer.parseInt(reader.readLine());
        left = new int[row][3];
        right = new int[row][3];
        for (int i = 0; i < row; i++) {
            String[] split = reader.readLine().split("_");
            String[] splitLeft = split[0].split("");
            String[] splitRight = split[1].split("");
            System.out.print(Arrays.toString(splitLeft));
            System.out.println(Arrays.toString(splitRight));
            for (int j = 0; j < splitLeft.length; j++) {
                if (splitLeft[j].equals("#")){
                    left[i][j] = -1;
                }
                if (splitRight[j].equals("#")){
                    right[i][j] = -1;
                }
            }
        }


        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(left[i][j] + " ");

            }
            System.out.println();
        }
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(right[i][j] + " ");
            }
            System.out.println();
        }
            int groups = Integer.parseInt(reader.readLine());
            System.out.println(groups);

            for (int i = 0; i < groups; i++) {
                String[] split = reader.readLine().split(" ");
                int nums = Integer.parseInt(split[0]);
                String side = split[1];
                String place = split[2];
                if (side.equals("left")) {
                    System.out.println("BINGO!!!");
                    if (nums == 3) {
                        for (int j = 0; j < row; j++) {
                            for (int k = 0; k < 3; j++) {
                                if ((left[j][0] + left[j][1] + left[j][2]) == 0) {
                                    System.out.println("Passengers can take seats: " + (j+1) + "A " + (j+1) + "B " + (j+1) + "C");
                                    left[j][0] = -1;
                                    left[j][1] = -1;
                                    left[j][2] = -1;
                                    System.out.print("XXX_");



                                }
                            }
                        }
                    }
                }
            }


        }catch (FileNotFoundException e){
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
