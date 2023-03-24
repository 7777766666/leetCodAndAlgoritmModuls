package org.example.algday1;



    class A {

        static String str = "ab";
        static {
            String t = str + str;
        }

        A() {
            printLength();
        }
        void printLength() {
            System.out.println(str.length() + "from A");
        }

        public static void main(String[] args) {

        }

    }
    class B extends A {
            static String str1 = "abc";
        void printLength() {
            System.out.println(str1.length() + " from B");
        }
        {
            String d = str + str;
        }


class Test22 {
}

        public static void main(String[] args) {
        new B();
        A rrr = new A();

    }
    public void ttt(){

    }
}

