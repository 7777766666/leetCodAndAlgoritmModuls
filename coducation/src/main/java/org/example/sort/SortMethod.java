package org.example.sort;

import java.util.List;

public class SortMethod {

public static String zzz(List<String> list) {
    if (list.size() == 0) {
        return "EMPTY";
    }
    if (list.size() == 1) {
        return list.get(0);
    }
    int size = 0;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).startsWith("A") || list.get(i).startsWith("C")) {
            return "ACTIVE";
        } else if (size < 2) {
            if (list.get(i).startsWith("P")) {
                size = 2;
            } else if ( size != 1 && list.get(i).startsWith("B")) {
                size = 1;
            }
        }
    }
    return (size == 2) ? "PAUSED" : (size == 1 ? "BLOCKED" : "EMPTY");
}

}
