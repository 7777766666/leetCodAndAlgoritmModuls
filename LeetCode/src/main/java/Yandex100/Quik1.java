//package Yandex100;
//import lombok.val;
//public class Quik1 {
//
//
//
//
//        public static String test(String n1, String n2) {
//
//            int maxLen = Math.max(n1.length(), n2.length());
//            int i = 1;
//
//            int onWait = 0;
//            val builder = new StringBuilder();
//            while (i < maxLen) {
//                int d1 = i > n1.length()
//                        ? 0
//                        : Character.getNumericValue(n1.charAt(n1.length() - i - 1));
//                int d2 = i > n2.length()
//                        ? 0
//                        : Character.getNumericValue(n2.charAt(n2.length() - i - 1));
//                int sum = d1 + d2 + onWait;
//                onWait = sum / 10;
//                builder.append(sum % 10).append(" ,");
//                i += 3;
//            }
//            if (onWait != 0) builder.append(onWait);
//            else builder.delete(builder.length() - 2, builder.length());
//            builder.append("[").reverse().append("]");
//            System.out.println(builder);
//            return builder.toString();
//        }
//
//}
