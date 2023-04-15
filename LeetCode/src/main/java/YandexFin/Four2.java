//package YandexFin;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//
//public class Four2 {
//    public static void main(String[] args) throws IOException {
//
//
//        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\4\\input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\4\\output.txt"));
//
//
//        int tests = Integer.parseInt(reader.readLine());
//        String[] split = reader.readLine().split(" ");
//        int userLine = Integer.parseInt(split[0]);
//        int car = Integer.parseInt(split[1]);
//
//        System.out.println(tests + "  int tests");
//        System.out.println(userLine + "  userLine");
//        System.out.println(car + "  car");
//
//        int[][] road = new int[userLine - 1][3];
//
//        int count = 0;
//        while (tests != count) {
//
//            for (int i = 0; i < car; i++) {
//
//                String[] str = reader.readLine().split(" ");
//                int integer1 = Integer.parseInt(str[0]);
//                int integer2 = Integer.parseInt(str[1]);
//                System.out.println(integer1 + "  int " + integer2);
//                road[integer1 - 2][integer2 - 1] = 1;
//            }
//            String s = String.valueOf((maxLine(road)) + 1);
//            System.out.println(s + "    @@@@@@@@@@@@@@@");
//
//
//
//            count++;
//            if (tests == count){
//                writer.write(String.valueOf((maxLine(road)) + 1));
//            }else {
//                writer.write(String.valueOf((maxLine(road)) + 1));
//                writer.newLine();
//            }
//        }
//
//        System.out.println(Arrays.toString(road));
//
//        for (int i = 0; i < road.length; i++) {
//            for (int j = 0; j < road[i].length; j++) {
//                System.out.print(road[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        System.out.println((maxLine(road) + 1) + "  + 1");
//
//        reader.close();
//        writer.close();
//    }
//
//    public static int maxLine(int[][] road) {
//
//        int z = 0;
//
//        int l = 0;
//        int m = 0;
//        int r = 0;
//
//        while (true) {
//
//            if (road[z][0] == 1) {
//                l = 1;
//            } else {
//                if (l == 0 || m == 0) {
//                    l = 0;
//                }
//            }
//            if (road[z][1] == 1) {
//                m = 1;
//            } else {
//                m = 0;
//            }
//            if (road[z][2] == 1) {
//                r = 1;
//            }else {
//                if (r == 0 || m == 0){
//                    r = 0;
//                }
//            }
//
//            if ((l + m + r) == 3){
//                return z;
//            }else {
//                z++;
//                if (z == road.length) return z;
//            }
//
//
//        }
//    }
//
//}
//
