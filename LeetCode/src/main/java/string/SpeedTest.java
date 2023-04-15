package string;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class SpeedTest {

    public static void main(String[] args) {
        // Генерация случайных бигИнтеджеров
        BigInteger num1 = generateRandomBigInt(100000);
        BigInteger num2 = generateRandomBigInt(100000);

        // Измерение времени работы
        long startTime = System.currentTimeMillis();

        // Сложение бигИнтеджеров
        BigInteger sum = num1.add(num2);

        // Измерение времени работы
        long endTime = System.currentTimeMillis();

        // Вывод времени работы
        System.out.println("Время работы: " + (endTime - startTime) + " миллисекунд");
    }
    // Генерация случайного бигИнтеджера длиной n символов
    public static BigInteger generateRandomBigInt(int n) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(rand.nextInt(9) + 1); // первая цифра не ноль
        for (int i = 1; i < n; i++) {
            sb.append(rand.nextInt(10));
        }
        return new BigInteger(sb.toString());
    }
}