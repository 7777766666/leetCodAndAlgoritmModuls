package org.example.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    enum State {
        ACTIVE(4),
        CREATED(3),
        PAUSED(2),
        BLOCKED(1),
        EMPTY(0);

        private final int priority;

        State(int priority) {
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }
    }

    public static void main(String[] args) {
        List<List<State>> stateLists = new ArrayList<>();
        Random random = new Random();

        // Создаем 1000 листов со случайными значениями энума State
        for (int i = 0; i < 1000; i++) {
            List<State> stateList = new ArrayList<>();
            for (int j = 0; j < 20000; j++) {
                int randomIndex = random.nextInt(State.values().length);
                stateList.add(State.values()[randomIndex]);
            }
            stateLists.add(stateList);
        }

        // Запускаем метод getPriority() для каждого списка и измеряем время выполнения
        long startTime = System.currentTimeMillis();
        for (List<State> stateList : stateLists) {
            for (State state : stateList) {
                state.getPriority();
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime) + " ms");
    }

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