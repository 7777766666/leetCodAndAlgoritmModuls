//import java.io.*;
//
//public class Quick100 {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//
//        String n1 = reader.readLine();
//        String n2 = reader.readLine();
//
//        int i = n1.length() - 1;
//        int j = n2.length() - 1;
//
//        int onWait = 0;
//        StringBuilder builder = new StringBuilder();
//        while (i > 1 || j > 1) {
//            int[] info1 = getNextValidDigit(n1, i);
//            int[] info2 = getNextValidDigit(n2, j);
//            int digit1 = info1[0];
//            int digit2 = info2[0];
//            i -= info1[1];
//            j -= info2[1];
//            int sum = digit1 + digit2 + onWait;
//            onWait = sum / 10;
//            builder.append(sum % 10).append(" ,");
//        }
//        if (onWait != 0) builder.append(onWait);
//        else builder.delete(builder.length() - 2, builder.length());
//
//        writer.write(builder.reverse().insert(0, "[").append("]").toString());
//        writer.close();
//    }
//
//    private static int[] getNextValidDigit(String number, int index) {
//        if (index <= 1) return new int[] {0, 0};
//        int indexCopy = index;
//        while (index > 1) {
//            index--;
//            char ch = number.charAt(index);
//            if (Character.isDigit(ch)) {
//                return new int[] {Character.getNumericValue(ch), indexCopy - index};
//            }
//        }
//
//        return new int[] {0, indexCopy - index};
//
//    }
//}
//
