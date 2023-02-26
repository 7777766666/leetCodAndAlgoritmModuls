package org.example.enamRoman;

public enum EnumRomanToArabic {

    I(1), II(2), III(3), IV(4), V(5);


        private final int x;

        EnumRomanToArabic(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }


}
