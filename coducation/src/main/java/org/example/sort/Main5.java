package org.example.sort;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main5 {
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


    static State getState(List<State> list) {
        State result = list.stream()
                .reduce((resultState, currentState) ->
                        resultState.getPriority() >= currentState.getPriority() ? resultState : currentState)
                .orElse(State.EMPTY);
        if (result == State.CREATED) return State.ACTIVE;
        return result;
    }

    static State getStateLoop(List<State> list) {
        State resultState = State.EMPTY;
        for (State state : list) {
            if (state.getPriority() >= resultState.getPriority()) {
                resultState = state;
            }
        }
        if (resultState == State.CREATED) return State.ACTIVE;
        return resultState;
    }

    public static void main(String[] args) throws Exception {

        // Создаем список листов со случайными строками
        Random rnd = new Random();
        List<List<State>> total_lists = new ArrayList<>();
        State[] states = State.values();
        for (int i = 0; i < 10_000_000; i++) {
            List<State> list = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                list.add(states[rnd.nextInt(5)]);
            }
            total_lists.add(list);
        }

        long start = System.currentTimeMillis();
        for (List<State> list : total_lists) {
            getState(list);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

}


