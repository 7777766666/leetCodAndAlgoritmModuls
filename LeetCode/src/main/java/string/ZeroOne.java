package string;


import java.util.HashMap;
import java.util.Map;

public class ZeroOne {

    public static void main(String[] args) {

        int[] z = {1, 1, 1, 1, 0, 0};
        ZeroOne.findSeq(z);

    }

    public static void findSeq(int[] arr) {

        var maxSeqLength = 0;
        var currentSeqLength = 0;
        var oCount = 0;
        var oPos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentSeqLength++;
            } else if (oCount == 0) {
                currentSeqLength++;
                oPos = i;
                oCount++;
            } else {
                if (maxSeqLength < currentSeqLength) maxSeqLength = currentSeqLength;
                currentSeqLength = 0;
                oCount = 0;
                i = oPos;
            }
        }

        if (maxSeqLength < currentSeqLength) maxSeqLength = currentSeqLength;

        System.out.println(maxSeqLength);
    }

}