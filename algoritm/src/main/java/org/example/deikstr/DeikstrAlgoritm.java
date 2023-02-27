package org.example.deikstr;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;

public class DeikstrAlgoritm {

    int a = 0, b, c, d;
    HashMap<String, Integer> arc = new LinkedHashMap<>();

    HashMap<String, Integer> finalTable = new LinkedHashMap<>();

    public DeikstrAlgoritm() {

        arc.put("AB", 10);
        arc.put("AD", 30);
        arc.put("BC", 20);
        arc.put("BD", 25);
        arc.put("CD", 30);
    }

    public Optional<String> point(String str) {
        Set<String> set = arc.keySet();
        return set.stream()
                .filter(key -> key.contains(str))
                .findFirst();
    }

    public int findPoint(String startPoint) {
        Optional<String> pointStart = point(startPoint);
        System.out.println(pointStart + "  lol");
        if (pointStart.isPresent()) {
            System.out.println(pointStart.get() +  "   999999999999");
            Integer pointFinded = arc.get(pointStart.get());
            System.out.println(pointFinded + "  letter  " + startPoint);
            return pointFinded;
        }
        return 0;
    }

    public void addAndDelete(String pointSome, Integer integer) {

        Optional<String> addPoint = point(pointSome);
        finalTable.put(addPoint.get(), integer);
        finalTable.put(addPoint.get(), integer);
        arc.remove(addPoint.get());

    }

//    public int pointAny(String element) {
//        Optional<String> pointElement = point(element);
//        System.out.println(pointElement + "  mem");
//        if (pointElement.isPresent()) {
//            System.out.println(pointElement.get() +  "   999999999999");
//            Integer pointFinded = arc.get(pointElement.get());
//            System.out.println(pointFinded + "  letter  " + startPoint);
//            finalTable.put(pointElement.get(), pointFinded);
//            arc.remove(pointElement.get());
//            return pointFinded;
//        }
//        return 0;
//    }


    public static void main(String[] args) {

        DeikstrAlgoritm deikstrAlgoritm = new DeikstrAlgoritm();

        String startPoint = "a".toUpperCase();
        String elementSecond = "b".toUpperCase();

        System.out.println((deikstrAlgoritm.arc.size()) + "  Start size hashMap");

        deikstrAlgoritm.findPoint(startPoint);

        System.out.println(deikstrAlgoritm.arc.size() + " length after remove");



        System.out.println(deikstrAlgoritm.point(elementSecond) + "  second");
        System.out.println(deikstrAlgoritm.finalTable.size() + "  final table ");


        System.out.println((deikstrAlgoritm.finalTable.get("AB")) +  "  return key AB  "
                + deikstrAlgoritm.finalTable.keySet());

        deikstrAlgoritm.findPoint(elementSecond);




    }
}
