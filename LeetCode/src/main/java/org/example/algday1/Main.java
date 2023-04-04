package org.example.algday1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {


        static class Xxx {
            int x, y, id;

            public Xxx(int x, int y, int id) {
                this.x = x;
                this.y = y;
                this.id = id;
            }
        }

        public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] ns = reader.readLine().split(" ");
            int n = Integer.parseInt(ns[0]);
            long s = Long.parseLong(ns[1]);
            Xxx[] points = new Xxx[n];
            for (int i = 0; i < n; i++) {
                String[] xy = reader.readLine().split(" ");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);
                points[i] = new Xxx(x, y, i + 1);
            }
            Arrays.sort(points, (p1, p2) -> Integer.compare(p1.x, p2.x));
            int maxCount = 0;
            int[] ans = new int[n];
            int ansCount = 0;
            for (int i = 0; i < n; i++) {
                long minY = points[i].y;
                for (int j = i; j < n; j++) {
                    minY = Math.min(minY, points[j].y);
                    long area = (long) (points[j].x - points[i].x + 1) * (minY - points[i].y + 1);
                    if (area <= s) {
                        int count = j - i + 1;
                        if (count > maxCount) {
                            maxCount = count;
                            ansCount = 0;
                            for (int k = i; k <= j; k++) {
                                ans[ansCount++] = points[k].id;
                            }
                        }
                    }
                }
            }
            writer.write(maxCount + "\n");
            for (int i = 0; i < maxCount; i++) {
                writer.write(ans[i] + " ");
            }
            writer.flush();
        }
    }


//
//    public static void main(String[] args) throws IOException {
//                BufferedReader reader = new BufferedReader(new FileReader("E:\\1\\3\\input.txt"));
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
//    static class Order {
//        int x, y, id;
//
//        Order(int x, int y, int id) {
//            this.x = x;
//            this.y = y;
//            this.id = id;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//
////        Scanner scanner = new Scanner(System.in);
//
//
////        BufferedReader reader = new BufferedReader(new FileReader("E:\\1\\input.txt"));
////        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\1\\output.txt"));
//
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String ns = reader.readLine();
//        String[] split = ns.split(" ");
//        int n = Integer.valueOf(split[0]);
//        int s = Integer.valueOf(split[1]);
//
//
//        List<Order> orders = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            String xy = reader.readLine();
//            int x = Integer.valueOf(split[0]);
//            int y = Integer.valueOf(split[1]);
//
////            int x = scanner.nextInt();
////            int y = scanner.nextInt();
////            int count = scanner.nextInt();
//            for (int j = 0; j < n; j++) {
//                orders.add(new Order(x, y, i));
//            }
//        }
//
//        List<Integer> result = new ArrayList<>();
//        int maxSize = 0;
//        for (int i = 0; i < orders.size(); i++) {
//            for (int j = i; j < orders.size(); j++) {
//                int width = orders.get(j).x - orders.get(i).x + 1;
//                int height = 0;
//                Map<Integer, Integer> counts = new HashMap<>();
//                for (int k = i; k <= j; k++) {
//                    int y = orders.get(k).y;
//                    counts.put(y, counts.getOrDefault(y, 0) + 1);
//                    height = Math.max(height, counts.get(y));
//                }
//                long area = (long) width * (long) height;
//                if (area <= s && (maxSize < height || (maxSize == height && result.size() < j - i + 1))) {
//                    maxSize = height;
//                    result.clear();
//                    for (int k = i; k <= j; k++) {
//                        result.add(orders.get(k).id);
//                    }
//                }
//            }
//        }
//
//        System.out.println(result.size());
//        for (int id : result) {
//            System.out.print(id + " ");
//        }
//    }
//}
//

