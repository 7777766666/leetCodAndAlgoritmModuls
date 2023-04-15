package Yandex100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Four {



    static class Car implements Comparable<Car> {
        int x, y;
        Car(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int compareTo(Car car) {
            return this.x - car.x;
        }
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Car car = (Car) obj;
            return x == car.x && y == car.y;
        }
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("E:\\2\\4\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\2\\4\\output.txt"));

        int T = Integer.parseInt(reader.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int N = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());

            PriorityQueue<Car> queue = new PriorityQueue<>();
            HashSet<Car> set = new HashSet<>();

            for (int i = 0; i < Q; i++) {
                st = new StringTokenizer(reader.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                Car car = new Car(x, y);
                if (set.contains(car)) {
                    continue;
                }
                set.add(car);
                queue.offer(car);
            }

            int maxLine = N;
            while (!queue.isEmpty()) {
                Car car = queue.poll();
                if ((car.x == N - 1 && car.y == 2) || (car.x == N && car.y > 1)) {
                    maxLine = car.x - 1;
                    break;
                }
                if (car.y > 1 && car.x < N) {
                    Car rightDown = new Car(car.x + 1, car.y - 1);
                    if (!set.contains(rightDown)) {
                        set.add(rightDown);
                        queue.offer(rightDown);
                    }
                }
                if (car.x < N) {
                    Car right = new Car(car.x + 1, car.y);
                    if (!set.contains(right)) {
                        set.add(right);
                        queue.offer(right);
                    }
                }
                if (car.y < 3 && car.x < N) {
                    Car rightUp = new Car(car.x + 1, car.y + 1);
                    if (!set.contains(rightUp)) {
                        set.add(rightUp);
                        queue.offer(rightUp);
                    }
                }
            }

            writer.write(maxLine + "\n");
        }

        reader.close();
        writer.close();
    }
}