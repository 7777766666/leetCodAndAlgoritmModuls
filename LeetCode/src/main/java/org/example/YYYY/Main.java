//package org.example.YYYY;
////
////import java.io.BufferedReader;
////import java.io.BufferedWriter;
////import java.io.IOException;
////import java.io.InputStreamReader;
////import java.io.OutputStreamWriter;
////import java.util.Arrays;
////
////public class Main {
//
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Main {
//
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("E:\\1\\3\\input.txt"));
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\1\\3\\output.txt"));
//
//
////        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String[] split = reader.readLine().split(" ");
//        int n = Integer.parseInt(split[0]);
//        int s = Integer.parseInt(split[1]);
//
//        int[][] orders = new int[n][2];
//
//        for (int i = 0; i < n; i++) {
//            String[] split1 = reader.readLine().split(" ");
//            int x = Integer.parseInt(split1[0]);
//            int y = Integer.parseInt(split1[1]);
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
//                int area =width * height;
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
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////    public static void main(String[] args) throws IOException {
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
////
////
////        int w = Integer.parseInt(bufferedReader.readLine());
////        String[] split = bufferedReader.readLine().split(" ");
////        int n = Integer.parseInt(split[0]);
////        int k = Integer.parseInt(split[1]);
////
////        int[] heights = new int[n];
////
////        for (int i = 0; i < n; i++) {
////            split = bufferedReader.readLine().split("x");
////            int width = Integer.parseInt(split[0]);
////            int height = Integer.parseInt(split[1]);
////            int newH = (int) Math.ceil((double) height * w / width);
////            heights[i] = newH;
////        }
////
////        Arrays.sort(heights);
////        int[] selectedHeights = Arrays.copyOfRange(heights, n - k, n);
////
////        int minH = selectedHeights[0];
////        int maxH = selectedHeights[k - 1];
////        bufferedWriter.write(String.valueOf(minH));
////        bufferedWriter.newLine();
////        bufferedWriter.write(String.valueOf(maxH));
////
////
////        bufferedReader.close();
////        bufferedWriter.close();
////
////
////
////    }
////
////}
