package org.example.Vk;

public class ttt {

    public static void main(String[] args) {
String[] mem = {"fg", "dddd", "okmlkm"};
        ttt ttt = new ttt();
        System.out.println(ttt.join(mem));

    }
    public String join(String[] args) {
         String result = "";
         for (String arg : args) {
         result += arg;
         result += ", ";
         }
         return result;
    }
}
