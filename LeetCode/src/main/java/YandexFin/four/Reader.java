package YandexFin.four;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Reader {

    public static void main(String[] args) throws FileNotFoundException {

//        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\4\\input.txt"));

        Scanner scanner = new Scanner(new FileReader("E:\\2\\4\\input.txt"));


        scanner.hasNextInt();
        int f1= scanner.nextInt();
        System.out.println(f1);
        scanner.hasNextInt();
        int f2 = scanner.nextInt();
        System.out.println(f2);
        scanner.hasNextInt();
        int f3 = scanner.nextInt();
        System.out.println(f3);
        scanner.hasNextInt();
        int f4 = scanner.nextInt();
        System.out.println(f4);
        scanner.hasNextInt();
        int f5 = scanner.nextInt();
        System.out.println(f5);
        scanner.hasNextInt();
        int f6 = scanner.nextInt();
        System.out.println(f6);
        scanner.hasNextInt();
        int f7 = scanner.nextInt();
        System.out.println(f7);

        scanner.close();

        Scanner scanner2 = new Scanner(new FileReader("E:\\2\\4\\input.txt"));

        scanner2.hasNextInt();
        int i = scanner2.nextInt();
        System.out.println(i);


    }

}
