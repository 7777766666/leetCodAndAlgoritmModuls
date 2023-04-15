package string;


public class Subsequence11 {
    public static void main(String[] args) {

        String s = "axc", t = "ahxbgdc";
        String s1 = "bb", t1 = "ahbgdc";
        String s3 = "axc", t3 = "ahbgdc";
        Subsequence11 sub = new Subsequence11();
        System.out.println(sub.subsequence(s, t) + "  RESULT!!!!");

        System.out.println((s.charAt(0) == s3.charAt(0)) + " char!!!!");
    }


    public boolean subsequence(String s, String t) {
        if (s.length() == 0) return true;

        if (s.length() > t.length()) return false;

        if (s.length() == t.length()) return (s.equals(t));

        if (s.length() == 1) return (t.contains(s));


        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int z = 0;
        int count = 0;

        for (int i = 0; i < chars2.length; i++) {

            if (chars1[z] == chars2[i]) {
                count++;
                z++;
                if (count == chars1.length) {
                    return true;
                }
                if (z == chars1.length) {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean subsequenceSlow(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == t.length()) {
            return (s.equals(t));
        }
        if (s.length() == 1) {
            return (t.contains(s));
        }
        String[] split1 = s.split("");
        String[] split2 = t.split("");
        int z = split1.length - 1;
        int count = 0;

        int l = 0;
        while (!split2[l].equals(split1[0])) {
            l++;
            if (l == split2.length - 1 && l > split2.length - split1.length - l)
                return false;
        }

        for (int i = split2.length - 1; i > l; i--) {
            if (split2[i].equals(split1[z])) {
                count++;
                z--;

                if (count == split1.length - 1) {
                    return true;
                }
                if (z == 0) {
                    return false;
                }
            }
        }


        return false;
    }

    public boolean subsequenceOld(String s, String t) {

        if (s.length() == 0) {
            return true;
        }

        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == t.length()) {
            return (s.equals(t));
        }
        if (s.length() == 1) {
            return (t.contains(s));
        }

        String[] split1 = s.split("");
        String[] split2 = t.split("");
        int z = 1;
        int count = 0;


        for (int i = 0; i <= t.length() - s.length(); i++) {
            if (split2[i].equals(split1[0])) {
//                l = i + 1;
                for (int j = i + 1; j < t.length(); j++) {
                    if (split2[j].equals(split1[z])) {
                        z++;
                        count++;
                        if (count == s.length() - 1) {
                            return true;
                        }
                    }


                }
            }
        }


        return false;
    }
}
