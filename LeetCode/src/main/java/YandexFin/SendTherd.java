package YandexFin;

import java.io.*;

public class SendTherd {


    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String[] devNum = reader.readLine().split(" ");
        int dev = Integer.parseInt(devNum[0]);
        int num = Integer.parseInt(devNum[1]);

        int[][] graph = new int[dev][dev];
        int m = Integer.parseInt(reader.readLine());
        int MAX = Integer.MAX_VALUE / 2;
        for (int i = 0; i < dev; i++) {
            for (int j = 0; j < dev; j++) {
                graph[i][j] = (i == j) ? 0 : MAX;
            }
        }
        for (int i = 0; i < m; i++) {
            String[] input = reader.readLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]) - 1;
            int time = Integer.parseInt(input[2]);
            graph[a][b] = time;
        }

        for (int k = 0; k < dev; k++) {
            for (int i = 0; i < dev; i++) {
                for (int j = 0; j < dev; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }

        int maxTime = 0;
        for (int i = 0; i < dev; i++) {
            maxTime = Math.max(maxTime, graph[num - 1][i]);
        }

        if (maxTime == MAX) {
            writer.write(String.valueOf(-1));
        } else {
            writer.write(Integer.toString(maxTime));
        }
        writer.newLine();
        writer.close();
        reader.close();
    }
}

