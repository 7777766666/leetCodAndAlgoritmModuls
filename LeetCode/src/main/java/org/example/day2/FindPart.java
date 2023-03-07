package org.example.day2;

public class FindPart {

    String a;
    String b;

    public FindPart(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public boolean findPart(String s, String t) {

        String[] a = s.split("");
        String[] b = t.split("");


        if (s.length() <= t.length()) {
            return false;
        }
        if (lengthInside(a, b) == false ){  //if length beetwin first and last < b.length +1
            return false;
        }


        return false;
    }

    public boolean lengthInside(String[] a, String[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(b[0])) {
                for (int j = a.length - 1; j >= 0; j--) {
                    if (a[j].equals(b[b.length - 1])) {
                        if ((j - i) <= b.length)
                        System.out.println("Разница длин норм");
                        return true;
                    }
                }
            }
        }
        System.out.println("Разница длин false");
        return false;
    }
}

