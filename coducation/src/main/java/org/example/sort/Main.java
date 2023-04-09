package org.example.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Alexandr {

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
    public class Main {
        static State getState(List<State> list) {
            State result = list.stream()
                    .reduce((resultState, currentState) ->
                            resultState.getPriority() >= currentState.getPriority() ? resultState : currentState)
                    .orElse(State.EMPTY);
            if (result == State.CREATED) return State.ACTIVE;
            return result;
        }
    }

    public static void main(String[] args) {

        List<State> stateList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(State.values().length);
            stateList.add(State.values()[randomIndex]);
        }

    }

}
