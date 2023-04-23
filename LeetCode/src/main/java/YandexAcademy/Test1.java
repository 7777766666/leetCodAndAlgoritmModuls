package YandexAcademy;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {



    public static void main(String[] args) throws FileNotFoundException, IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("E:\\4\\Test\\1\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\4\\Test\\1\\output.txt"));
        Scanner scanner = new Scanner(new FileReader("E:\\4\\Test\\1\\input.txt"));

//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//        Scanner scanner = new Scanner(new FileReader("input.txt"));


        int val = scanner.nextInt();


        int[] boxes = new int[val];
        int z = 0;

        while (z < val) {
            boxes[z++] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(boxes));

        int result = -666;
        for (int i = 1; i < boxes.length; i++) {
            if (boxes[i] < boxes[i - 1]) {
                result = -1;
                System.out.println(" -1, not sort");
                writer.write("-1");
                break;
            }
        }
        if (result != -1) {
            writer.write(String.valueOf(boxes[boxes.length - 1] - boxes[0]));
        }


        writer.close();
        scanner.close();


    }
}
