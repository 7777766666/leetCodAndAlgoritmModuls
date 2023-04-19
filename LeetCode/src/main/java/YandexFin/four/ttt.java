package YandexFin.four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ttt {


    public static void main(String[] args) {

        int[] start = new int[3];

        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> coordinates = new ArrayList<>();
        coordinates.add(0); // добавление первой координаты
        coordinates.add(start[0]); // добавление второй координаты
        queue.offer(coordinates); // добавление координат в конец очереди
        System.out.println(queue);
        coordinates.add(0); // добавление первой координаты
        coordinates.add(start[1]); // добавление второй координаты
        queue.offer(coordinates); // добавление координат в конец очереди
        System.out.println(queue);
        coordinates.add(0); // добавление первой координаты
        coordinates.add(start[2]); // добавление второй координаты
        queue.offer(coordinates); // добавление координат в конец очереди

        System.out.println(queue);


    }
}
