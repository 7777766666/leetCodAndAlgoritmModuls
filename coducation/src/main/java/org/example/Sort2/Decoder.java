package org.example.Sort2;
import java.util.Base64;
public class Decoder {




        public static void main(String[] args) {
            Base64.Decoder d1 = Base64.getDecoder();
            byte[] a = d1.decode("SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==");
            String str = new String(a);
            System.out.println(str);
        }

}
