package string;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;

public class TestDouble {

    private static double doubleTotal = 0;
    private static double doubleTotal1 = 0;
//    private static long longTotal = 0;
    private static double kahanDoubleTotal = 0;
    private static BigDecimal bdTotal = BigDecimal.ZERO;

    public static void main(String[] args) {

        int iteration = 100000;
        double[] values = construct(Math::random, iteration);
        System.out.printf("Time taken for double calculation: %fms%n", time(TestDouble::sumToDouble, values));
        System.out.printf("Time taken for Kahan double calculation: %fms%n", time(TestDouble::kahanSumToDouble, values));
        System.out.printf("Time taken for long calculation: %fms%n", time(TestDouble::sumToLong, values));
        System.out.printf("Time taken for BigDecimal calculation: %fms%n", time(TestDouble::sumToBigDecimal, values));
        System.out.printf("Value diff for simple sum: %s%n", bdTotal.subtract(BigDecimal.valueOf(doubleTotal)).abs().toString());
        System.out.printf("Value diff for Kahan sum: %s%n", bdTotal.subtract(BigDecimal.valueOf(kahanDoubleTotal)).abs().toString());
        System.out.printf("Value diff for long sum: %s%n", bdTotal.subtract(BigDecimal.valueOf(doubleTotal1)).abs().toString());
    }

    private static double time(Consumer<double[]> consumer, double[] values) {

        long start = System.nanoTime();
        consumer.accept(values);
        long end = System.nanoTime();

        return 1.0 * (end - start) / (1000 * 1000);
    }

    private static double[] construct(DoubleSupplier supplier, int size) {
        return DoubleStream
                .iterate(supplier.getAsDouble(), operand -> supplier.getAsDouble())
                .limit(size)
                .toArray();
    }

    private static void kahanSumToDouble(double[] values) {
        double approxError = 0;
        for (double value : values) {
            double adjustedValue = value - approxError;
            double adjustedSum = kahanDoubleTotal + adjustedValue;
            approxError = (adjustedSum - kahanDoubleTotal) - adjustedValue;
            kahanDoubleTotal = adjustedSum;
        }
    }

    private static void sumToDouble(double[] values) {
        for (double value : values) {
            doubleTotal += value;
        }
    }

//    private static void sumToLong(double[] values) {
////        double doubleTotal1 = 0.0; // сумма значений типа double
//        BigDecimal bigDecimalL = new BigDecimal("10000000000000000000000"); // BigDecimal со значением 10^18
//
//        for (double value : values) {
//            BigDecimal bigDecimalValue = new BigDecimal(Double.toString(value)); // конвертируем double значение в BigDecimal
//            BigDecimal product = bigDecimalL.multiply(bigDecimalValue); // умножаем на 10^18
//            BigDecimal divided = product.divide(bigDecimalL); // делим на 10^18, чтобы вернуть десятичную точку в исходное место
//            doubleTotal1 += divided.doubleValue(); // добавляем к общей сумме
//        }
//
////        return doubleTotal; // возвращаем сумму значений типа double
//    }

    private static void sumToLong(double[] values) {
        for (double value : values) {
            long l = 100_000_000_000_000_000L;
             doubleTotal1 +=( double) ((long) ( l *  value )) / l;


        }
    }

    private static void sumToBigDecimal(double[] values) {

        BigDecimal ret = BigDecimal.ZERO;

        for (double value : values) {
            ret = ret.add(BigDecimal.valueOf(value));
        }

        bdTotal = ret;
    }
}
