package YandexFin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class First {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String first = reader.readLine();
        String second = reader.readLine();

        int i = first.length() - 1;
        int j = second.length() - 1;

        int wait = 0;
        StringBuilder builder = new StringBuilder();
        while (i > 1 || j > 1) {
            int[] info1 = next(first, i);
            int[] info2 = next(second, j);
            int digit1 = info1[0];
            int digit2 = info2[0];
            i -= info1[1];
            j -= info2[1];
            int sum = digit1 + digit2 + wait;
            wait = sum / 10;
            builder.append(sum % 10).append(" ,");
        }
        if (wait != 0) builder.append(wait);
        else builder.delete(builder.length() - 2, builder.length());

        writer.write(builder.reverse().insert(0, "[").append("]").toString());
        writer.close();
    }

    private static int[] next(String number, int index) {
        if (index <= 1) {
            return new int[] {0, 0};
        }
        int next = index;
        while (index > 1) {
            index--;
            char ch = number.charAt(index);
            if (Character.isDigit(ch)) {
                return new int[] {Character.getNumericValue(ch), next - index};
            }
        }

        return new int[] {0, next - index};

    }
}


