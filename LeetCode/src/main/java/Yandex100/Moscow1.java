//package Yandex100;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Moscow1 {
//
//    public static void main(String[] args) throws IOException {
//
////        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\input.txt"));
////        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\output.txt"));
//
//        List<String> stringList = null;
//        try (BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\input.txt"))) {
//            stringList = new ArrayList<>();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                stringList.add(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        List<BigInteger> bigIntList = new ArrayList<>();
//        for (String s : stringList) {
//            String numbers = s.substring(1, s.length()-1).replaceAll(",\\s*", "");
////            String[] numbers = s.replaceAll("[\\[\\]\\s,]+", "").split("");
//            BigInteger bigInt = BigInteger.ZERO;
//            for (String number : numbers) {
//                bigInt = bigInt.multiply(BigInteger.TEN).add(new BigInteger(number));
//            }
//            bigIntList.add(bigInt);
//        }
//        BigInteger result = BigInteger.ZERO;
//        for (BigInteger bigInt : bigIntList) {
//            result = result.add(bigInt);
//        }
//        StringBuilder sb = new StringBuilder("[");
//        String[] digits = result.toString().split("");
//        for (int i = 0; i < digits.length; i++) {
//            sb.append(digits[i]);
//            if (i < digits.length - 1) {
//                sb.append(", ");
//            }
//        }
//        sb.append("]");
//        String str = sb.toString();
//        System.out.println(str);
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\output.txt"))) {
//
//            writer.write(str);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//
//
//
////        List<String> stringList = Arrays.asList(
////                "[1, 1, 1, 1, 1, 1, , 1, 1, 1, 2, 1, 1, 3, 3, 3, 1 ]",
////                "[1, 1, 1, 1,3, 3, 3, 1 ]",
////                "[1, 1, 2, 1, 1, 3, 3, 3, 1 ]"
////        );