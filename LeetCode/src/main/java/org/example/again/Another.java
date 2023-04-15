package org.example.again;

import java.util.ArrayList;
import java.util.Collections;

public class Another {

//    private static final String booleansString;

//    static {
//        var random = new Random();
//        booleansString = Stream.generate(() -> random.nextInt(2)).limit(1000)
//                .map(Objects::toString)
//                .collect(Collectors.joining());
//    }

    public static void main(String[] args) {
//        String x = "1, 1, 0, 1, 1, 0, 1";


        int[] z = { 1, 1, 1 };
        System.out.println(maxSiq(z));

//        var maxLength = Arrays.stream(x.split("0")).mapToInt(String::length).max().getAsInt();
//        System.out.println(maxLength);
    }

    public static int maxSiq(int[] ar) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 1) count++;
            else if (ar[i] == 0 && ar[i + 1] == 1) count += 0;
            else {
                result.add(count);
                count = 0;
            }
        }
        return Collections.max(result);
    }



}
