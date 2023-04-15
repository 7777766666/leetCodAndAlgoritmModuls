package Yandex100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Moscow4 {



    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\output.txt"));

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String line1 = reader.readLine();
        String line2 = reader.readLine();

        BigInteger number1 = convertToBigInteger(line1);
        BigInteger number2 = convertToBigInteger(line2);
        BigInteger sum = number1.add(number2);
        String str = "[" + sum.toString() + "]";


        writer.write(str);
        writer.close();
    }

    private static BigInteger convertToBigInteger(String line) {
        String[] digits = line.replaceAll("[^\\d]+", "").split("");
        StringBuilder sb = new StringBuilder();
        for (String digit : digits) {
            sb.append(digit);
        }
        return new BigInteger(sb.toString());
    }

}
