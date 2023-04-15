package YandexFin;

import java.io.*;

public class Tree {


    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String[] nAndX = reader.readLine().split(" ");
        int n = Integer.parseInt(nAndX[0]);
        int x = Integer.parseInt(nAndX[1]);

        int[][] graph = new int[n][n];
        int m = Integer.parseInt(reader.readLine());
        int INF = Integer.MAX_VALUE / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = (i == j) ? 0 : INF;
            }
        }
        for (int i = 0; i < m; i++) {
            String[] input = reader.readLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]) - 1;
            int t = Integer.parseInt(input[2]);
            graph[a][b] = t;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }

        int maxTime = 0;
        for (int i = 0; i < n; i++) {
            maxTime = Math.max(maxTime, graph[x - 1][i]);
        }

        if (maxTime == INF) {
            writer.write("-1");
        } else {
            writer.write(Integer.toString(maxTime));
        }
        writer.newLine();
        writer.close();
        reader.close();
    }
}

