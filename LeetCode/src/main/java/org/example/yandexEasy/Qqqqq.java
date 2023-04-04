//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String[] input = reader.readLine().split(" ");
//        int n = Integer.parseInt(input[0]);
//        long s = Long.parseLong(input[1]);
//
//        int[][] orders = new int[n][2];
//
//        for (int i = 0; i < n; i++) {
//            String[] order = reader.readLine().split(" ");
//            int x = Integer.parseInt(order[0]);
//            int y = Integer.parseInt(order[1]);
//            orders[i][0] = x;
//            orders[i][1] = y;
//        }
//
//        int maxCount = 0;
//        int[] maxIndices = new int[0];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int minX = orders[i][0];
//                int maxX = orders[j][0];
//                int minY = Integer.MAX_VALUE;
//                int maxY = Integer.MIN_VALUE;
//
//                for (int k = i; k <= j; k++) {
//                    int y = orders[k][1];
//                    if (y < minY) {
//                        minY = y;
//                    }
//                    if (y > maxY) {
//                        maxY = y;
//                    }
//                }
//
//                int width = maxX - minX + 1;
//                int height = maxY - minY + 1;
//                long area = (long) width * (long) height;
//
//                if (area <= s) {
//                    int count = j - i + 1;
//                    if (count > maxCount) {
//                        maxCount = count;
//                        maxIndices = new int[count];
//                        for (int k = 0; k < count; k++) {
//                            maxIndices[k] = i + k + 1;
//                        }
//                    }
//                }
//            }
//        }
//
//        writer.write(maxCount + "\n");
//        for (int index : maxIndices) {
//            writer.write(index + " ");
//        }
//        writer.flush();
//    }
//}
