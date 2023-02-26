package org.example.enamRoman;

public enum RomanAndArab {


    SMDLKSDNLKNS("V", 5),
    EMBLKEDFMLERMBLE("III", 3),
    DLKFMBEL("II", 2),
    SLKMDBLKSM("IV", 4),
    LKSDNBDSLKN("I", 1);


    private final String str;
    private final int x;

    RomanAndArab(String str, int x) {
        this.str = str;
        this.x = x;
    }

    public String getStr() {return str;
    }

    public int getX() {
        return x;
    }
}
